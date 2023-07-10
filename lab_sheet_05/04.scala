object q04 extends App{
    def isEven(n:Int):Boolean = {
        if(n%2 == 0) true
        else false
    }
    def isOdd(n:Int):Boolean = {
        if(n%2 == 1) true
        else false
    }

    def EvenOdd(n:Int): String = n match{
        case x if x <= 0 => "Not a postive integer"
        case x if isEven(n) => "Even Number"
        case x => "Odd Number"
    }

    println(EvenOdd(10))
    println(EvenOdd(21))
    println(EvenOdd(111))
}