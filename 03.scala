object q03 extends App{
  def toUpper(str:String) = str.toUpperCase
  def toLower(str:String) = str.toLowerCase
  def firstUpper(str:String) = str.capitalize
  def lastUpper(str:String) = str.capitalize
  def formatNames(name:String, fun:String=>String) = fun(name)
  println(toUpper("hellow"))
  println(firstUpper("nnnsdsdadsSDDASDiasdp"))
  println(lastUpper("heelj"))
}