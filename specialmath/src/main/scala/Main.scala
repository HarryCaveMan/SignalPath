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
  // my poor little laptoop cannot do f(90)
  def specialMath(n:Long):Long = {
      if(n==0) 0 else if(n==1) 1 else 
      n + specialMath(n-1)	+ specialMath(n-2)
  }
}