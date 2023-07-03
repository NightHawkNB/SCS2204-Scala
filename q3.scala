import scala.io.StdIn.readInt
object q3 extends App{
  def sum(n1:Int,n2:Int):Float=(n1+n2).toFloat
  def avg(n:Float) = n/2
  println("Enter N1 : ")
  var num1 = readInt()
  println("Enter N2 : ")
  var num2 = readInt()

  var mean = avg(sum(num1, num2))
  printf("%.2f", mean)
}