package tutorial.exercise1

object Test3 {
  def main(args:Array[String]):Unit={
    //高阶函数：函数的参数是函数，函数的返回值是函数
    def fun1(a:Int,f:(Int,Int)=>Int):Int={
      val result=f(4,4)
      println("------------------------")
      a*result
    }
    def sum(a:Int,b:Int):Int={
      a+b
    }
    println(fun1(5,sum))
    println(fun1(5,(a,b)=>{a*b}))

    def fun2(a:Int,b:Int):(String,String)=>String={
      def fun4(c:String,d:String)={
        a+b+c+d
      }
      fun4
    }
    val function: (String, String) => String = fun2(1,2)
    println(function("3","4"))

    def fun3(f:(Int,Int)=>Int):(Int,Int)=>Int={
      f
    }
    println(fun3((a,b)=>a+b)(1,2))
    println(fun3(_+_)(3,4))
  }
}
