object q02 extends App{
    def occurence(words: List[String]) : Int = {
        var count = words.map(word => word.length)
        var total = count.reduce((x,y) => x+y)
        total
    }

    val word_list = List("apple", "banana", "cherry", "date")
    var count = occurence(word_list)
    println(count)
}