package tutorial.exercise1

import tutorial.exercise1.Person.myHeight

class Person(myname:String,myage:Int){
  val name = myname
  val age = myage
  var money = 1000


  println(11111)
  //重写构造器
  def this(myname:String,myage:Int,mymoney:Int){
    this(myname,myage)
    money = mymoney
  }
  {
    println(44444)
    println(55555)

  }
  println(22222)
  def test():Unit={
    println("能否打印出来？")
  }

  println(33333)
  println(myHeight)
}

object Person {
  private var myHeight = 170
  def main(args:Array[String]):Unit={
//    val a = 1
//    print(a)
    // ctrl+alt+v:变量名自动补全
    // alt+enter:补全变量类型
    val person: Person = new Person("ls",20)
    println(person.name+"       "+person.age)



  }
}
