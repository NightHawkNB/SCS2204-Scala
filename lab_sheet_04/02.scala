import scala.io.StdIn.readInt
object q02 extends App{
    def cat(n:Int) = n match{
        case x if x<0 => println("Negative")
        case x if x==0 => println("Zero")
        case x if x%2==0 => println("Even")
        case x => println("Odd")
    }
    var x = readInt()
    cat(x)
}   