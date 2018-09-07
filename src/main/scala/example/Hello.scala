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

  //Calls fib method on a 10 element list and gets the fibonacci list until
  //the 10th element
  def getFibonacci: List[Int] = fib take 10 toList

}
