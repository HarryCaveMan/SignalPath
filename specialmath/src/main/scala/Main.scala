import java.math.BigInteger

object Main extends App {
  if( args.length != 1) {
    // Checks for missing input
    println("Expecting exactly 1 argument...")
    sys.exit(1)
  } else {
    try {
      val input_n:BigInt = new BigInt(new BigInteger(args(0)))
      println(specialMath(input_n))
    } catch {
      // Checks for parse error due to invalid input
      case ex:NumberFormatException => {
        println("Input string not valid hexidecimal representation")
        sys.exit(1)
      }
    } 
  }
  // my poor little laptop cannot do f(90) which is at least O((3/2)**90) time
  def specialMath(n:BigInt):BigInt = {
      var sum:BigInt = 0
      var minus_two:BigInt = 0
      var minus_one:BigInt = 1   
      for(i <- 2 to n.toInt) {
        sum = i + minus_one + minus_two
        minus_two = minus_one
        minus_one = sum
      } 
      sum
    }
}