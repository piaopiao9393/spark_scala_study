package tutorial.exercise1
import scala.io.StdIn

object Test2 {
  def main(args:Array[String]):Unit={
//    println("请输入年龄:")
//    val age: Int = StdIn.readInt()
//    if(age>=18 && age<=45){
//      println("成年")
//    }else{
//      println("未成年")
//    }

    // 九九乘法表
    for(i <- 1 to 9; j <- 1 to i){
      print(j+"*"+i+"="+(i*j)+"\t")
      if(i==j) println()
    }

    //函数定义
    def getMax(a:Int,b:Int):Int={
      if(a>=b) return a
      else return b
    }
    val result = getMax(1,10)
    println(result)

    println(fun4(1,2,3,4,5))
  }

  //递归函数
  def fun2(num:Int):Int={
    if(num==1) num
    else num*fun2(num-1)
  }

  //包含默认参数的函数
  def fun3(a:Int=5,b:Int=5):Int={
    a+b
  }

  //可变参数个数的函数
  def fun4(elements:Int*):Int={
    var sum=0
    for(elem<-elements) sum+=elem
    return sum
  }

  //嵌套函数
  def fun5(a:Int,b:Int):Int={
    def fun6(c:Int):Int={
      (a+b)*c
    }
    fun6(5)
  }


}
