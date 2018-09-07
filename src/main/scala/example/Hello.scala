package example

object exercise {
  def main(args: Array[String]): Unit = {
    
    val calculator = new iCalculator()
    println(calculator getFibonacci)

    val calculator2 = new iCalculator2()
    println(calculator2 add)
    println(calculator2 subtract)
  }
}


class iCalculator() {
  //Recursive function that calculates fibonacci from a list
  private def fib: Stream[Int] = 0 #:: fib.scanLeft(1)(_ + _)

  //Calls fib method on a 10 element list and gets the fibonacci list until
  //the 10th element
  def getFibonacci: List[Int] = fib take 10 toList
}

class iCalculator2() extends iCalculator(){
  def add: String = "Crystian Carranco"
  def subtract: String =  "Homero Silva"
}
