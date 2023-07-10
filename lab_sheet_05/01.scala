object q01 extends App{
    
    def gcd(a:Int, b:Int): Int = b match {
        case 0 => a
        case x if x>a => gcd(x,a)
        case x => gcd(x, x%a)
    }

    def isPrime(n:Int, temp:Int=2):Boolean = n match {
        case x if(x == 2) => true
        case x if(x%temp == 0) => false
        case x if(x == temp) => true
        case _ => isPrime(n, temp+1)
    }

    println(isPrime(5))
}