object q03 extends App{
  def toUpper(str:String) = str.toUpperCase
  def toLower(str:String) = str.toLowerCase
  def formatNames(name:String, fun:String=>String, pos:Int) = {
    var newname2 = ""
    newname2 += name.substring(0,pos)
    newname2 += fun(name).charAt(pos)
    newname2 += name.substring(pos+1)
    newname2
  }
  println(formatNames("Benny", toUpper, 0))
  println(formatNames("Niroshan", toUpper, 1))
  println(formatNames("Saman", toLower, 0))
  println(formatNames("Kumara", toUpper, 5))

}