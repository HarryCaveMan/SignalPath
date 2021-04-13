import java.util.Base64
import scala.collection.mutable.ArrayBuffer

object Main extends App {
  if( args.length != 1) {
    // Checks for missing input
    println("Expecting exactly 1 argument...")
    sys.exit(1)
  }
  else {
    try {
      println(encode_hex(args(0)))
    } catch {
      // Checks for parse error due to invalid input
      case ex:NumberFormatException => {
        println("Input string not valid hexidecimal representation")
        sys.exit(1)
      }
    }
  }
  
  def encode_hex(input:String):String = {
    // Decode hex string into byte array (uses BigInteger because Int (8 bit signed?) is too small)
    // Should probably come up with a boilerplate parser that is not subject to overflow errors
    //val as_bytes:Array[Byte] = new java.math.BigInteger(input,16).toByteArray()
    
    val as_bytes:Array[Byte] = hex_2_bytes(input)
    // Re-encode byte array into base64 representation
    Base64.getEncoder().encodeToString(as_bytes)
  }
  // This is much better than the old method
  // because:
  //  it only uses O(1) memory
  //  It The overflow limit is the ssize limit of Array and ArrayBuffer
  def hex_2_bytes(input:String):Array[Byte] = {
    val bytes:ArrayBuffer[Byte] = ArrayBuffer[Byte]() 
    for (byte_string <- input.grouped(2)) {
      bytes += java.lang.Long.parseLong(byte_string,16).toByte
    }
    bytes.toArray
  }
}