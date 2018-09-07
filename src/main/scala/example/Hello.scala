package example

object exercise {
  def main(args: Array[String]): Unit = {
    val calculator = new iCalculator()
    println(calculator getFibonacci)
  }
}


class iCalculator() {

  //Recursive function that calculates fibonacci from a list
  private def fib: Stream[Int] = 0 #:: fib.scanLeft(1)(_ + _)

  private def fibonacci: List[Int] = fib take 10 toList

  def getFibonacci(): List[Int] =  fibonacci
}
