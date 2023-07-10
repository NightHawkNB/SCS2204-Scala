object q03 extends App{
    def total(n:Int):Int = {
        if(n != 0){
            n + total(n-1)
        }else{
            0
        }
    }

    println(total(5))
}