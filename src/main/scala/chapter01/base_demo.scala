package chapter01

object base_demo {
  def main(args: Array[String]): Unit = {
    // ------------------------------声明变量-----------------------------------
    // val 声明常亮----你无法改变他的内容 我们鼓励使用val-除非你真的需要改变它的内容
    val name="张三"
    // var 声明变量
    var age=19
    println(name+"的年龄为"+age)
    // 声明变量时指定类型（在Scala中，变量或函数的类型总是写在变量或函数名称的后面）
    val counry:String = "CN"
    // 也可以将多个值或变量放在一起声明
    val height,weight = 100
    // ------------------------------常用类型-----------------------------------
    //Scala有7中数值类型：Byte Char Short Int Long Float Double Boolean 这些类型都是类
    1.toString()
    // scala 用底层 java.lang.String类来表示字符串，不过它通过StringOps类给字符串追加了上百种操作。
    val aa = "hello".intersect("loli") //在这个表达式中，java.lang.String对象"hello"首先被隐式转换为 StringOps类 然后再执行StringOps类中的方法
    // intersect 找出两个字符串中重复的字符
    // ------------------------------apply方法-----------------------------------
    //在scala中，我们通常会使用类似函数调用的语法
    "Hello"(4) // 将产出'o' 它背后的实现原理是一个名为apply 的方法。def apply(n:Int): Char
    "hello".apply(4)
    BigInt("123456") //是如下语句的简写
    BigInt.apply("123456") //像这样使用伴生对象apply方法是Scala中构建对象的常用手法。
    //------------------------------课后习题-----------------------------------
    import math._

    println(3-pow(sqrt(3),2))
    println("crazy"*3)
    println(10 max 2)
    println(max(10,2))
    println(10.max(2))
    /**
     *     3.res变量是val
     *
     */





  }
}
