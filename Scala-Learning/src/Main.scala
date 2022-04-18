object Main {
  def main(args: Array[String]): Unit = {

    // Variable Declarations
    val immutableVariable : String = "Humaeed"
    var mutableVariable : Int = 10;

    // Functions
    def factorial(n: Long): Long = {
      if (n <= 1) n
      else n * factorial(n - 1)
    }

    def sum(a: Int, b: Int): Int  = a + b
    println(sum(1, 2))

    val blockOfCode = {
      var something = 10;
      something *= 2
      something + mutableVariable
    }
    println(blockOfCode)

    
  }
}