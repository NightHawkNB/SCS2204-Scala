object q03 extends App{
  def toUpper(str:String) = str.toUpperCase
  def toLower(str:String) = str.toLowerCase
  def firstUpper(str:String) = str.capitalize
  def lastUpper(str:String) = str.capitalize
  def formatNames(name:String, fun:String=>String, pos:Int) = {
    var newname = name.replace(name.charAt(pos), fun(name).charAt(pos))
    newname
  }
  println(formatNames("Benny", toUpper, 0))
  println(formatNames("Niroshan", toUpper, 1))
  println(formatNames("Saman", toLower, 0))
  println(formatNames("Kumara", toUpper, 5))

}