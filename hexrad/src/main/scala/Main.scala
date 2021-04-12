import java.util.Base64

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
    val as_bytes:Array[Byte] = new java.math.BigInteger(input,16)
    // Re-encode byte array into base64 representation
    Base64.getEncoder().encodeToString(as_bytes)
  }
}