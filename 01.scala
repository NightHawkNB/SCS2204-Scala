object q01 extends App{
    def interest(d:Double):Double = d match{
        case x if x<20001 => 0.02*x
        case x if x<200001 => 0.04*x
        case x if x<2000001 => 0.035*x
        case x => 0.065*x
    }

    println(interest(20000))
    println(interest(200000))
    println(interest(2000000))
    println(interest(20000000))
    println(interest(200000000))
}