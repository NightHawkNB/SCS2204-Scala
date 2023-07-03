object q2 extends App{

  def length(a:List[String]) = {
    var list1 = List[String]();
    for(i<-a){
      if(i.length > 5){
        list1 = list1 :+i;
      }
    }
    list1;
  }

  var list2 = List[String]("Marcus","Charlotte","Lillie","Brent");
  var output = length(list2);
  for(i<-output){
    printf("%s ",i);
  }
}