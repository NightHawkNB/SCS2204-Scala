object Main extends App {
  def isPrime(n: Int): Boolean = n match {
    case x if x <= 1 => false
    case 2 => true
    case x if x % 2 == 0 => false
    case _ =>
      var i = 3
      while (i * i <= n) {
        if (n % i == 0) return false
        i += 2
      }
      true
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val outputList = filterPrime(inputList)

  println(outputList)
}