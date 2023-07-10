object q05 extends App{
    def isEven(n:Int):Boolean = {
        if(n%2 == 0) true
        else false
    }

    def evenTotal(n:Int): Int = {
        if(n>0 && isEven(n)){
            n + evenTotal(n-2)
        }else if(n == 0){
            0
        }else{
            evenTotal(n-1)
        }
    }

    println(evenTotal(10))
}