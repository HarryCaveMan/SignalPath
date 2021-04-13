object Main extends App {
  if( args.length != 1) {
    // Checks for missing input
    println("Expecting exactly 1 argument...")
    sys.exit(1)
  } else {
    try {
      val input_n:Int = Integer.parseInt(args(0))
      println(specialMath(input_n))
    } catch {
      // Checks for parse error due to invalid input
      case ex:NumberFormatException => {
        println("Input string not valid hexidecimal representation")
        sys.exit(1)
      }
    } 
  }
  // I guess the purpose of this exercise was to force a better implementation
  // The Naive recursive algorithm is ~1.5^90 time complexity 
  // 1.5^90 = 7050392822843069.....yikes
  def specialMath(n:Long):Long = {
      if(n==0) 0 else if(n==1) 1 else 
      n + specialMath(n-1)	+ specialMath(n-2)
  }
}