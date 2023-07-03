import scala.io.StdIn.readLine
object q1 extends App{

  def reverse(str:String):Unit = {
    if(!str.isEmpty()){
      reverse(str.substring(1));
      printf("%s",str.charAt(0));
    }

  }
  println("Enter a string")
  var word = readLine()
  reverse(word)
}