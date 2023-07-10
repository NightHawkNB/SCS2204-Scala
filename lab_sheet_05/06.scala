object q06 extends App{
    def fibo(n:Int): Int = n match {
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => fibo(x-1) + fibo(x-2)
    }

    def printFibo(n:Int): Any = {
        if(n >= 0){
            printFibo(n-1)
            println(fibo(n))
        }
    }

    printFibo(10)
}