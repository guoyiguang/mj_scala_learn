package chapter02

object section1 {

  def main(args: Array[String]): Unit = {

    // ------------------------------if/else-----------------------------------
    // scala 中 if/else 表达式有值，这个值就是跟在  if或else后面表达式的值。
    // 下面三种 一样
    val a = 3
    if (a > 0) 1 else -1
    val s = if(a>0) 1 else -1
    var b:Int = 1
    if (a>0) b = 1 else  b = -1
    // 在scala中，每个表达式都有一个类型。举例来说，表达式 if(x>0) 1 else -1 的类型是Int ，因为两个分支的类型都是Int
    val x=1
    // 下表达式的类型是两个分支类型的公共超类型。在本例中，其中一个分支是 java.lang.String 一个是Int 他们的公共超类型是 Any
    if (x>0) "positive" else -1
    // 如果else缺失，那么if语句可能没值，但是在Scala中，每个表达式都应该有某种值，这个问题的解决方案就是引入一个Unit类 写作（）
    if(x>0) 1 else () //（）可以当做 "无有用值" 将Unit当做Java 中的void

    // ------------------------------语句终止-----------------------------------
    // scala中行尾位置不需要分号，只要能能够从上下文明确的判断这里是语句的终止即可。
    var n = 0
    var r = 1
    if(n>0){r=r*n;n-=1} //如果想在单行写下多个语句，就需要以分号隔开。
    // 如果多行 一般使用{ } 包起来
    if(n>0){
      r=r*n
      n-=1
    }

    // ------------------------------块表达式和赋值-----------------------------------
    // 在Scala中{ }块包含一系列表达式，其结果也是一个表达式。块中最后一个表达式的值就是块的值 这个特性对于那种对某个val 的初始化需要分多步完成的情况很有用。例如
    var y = 2
    val y0 = 1
    import math._
    val distince = {val dx = x-r;val dy = y-y0;sqrt(dx*dx+dy*dy)} // 块的值取最后一个表达式 也就是 distince = sqrt()
    // 赋值语句是没有值的，或者说，他们的值是Unit类型。
    val unit_value = {y=y*2;n=y+3}
    print(unit_value) //结果为 （）
    // ------------------------------输入和输出-----------------------------------
    // 你可以用readLine 从控制台读取一行输入。
    val name = readLine("Your name is : ")
    print("Your age : ")
    // 读取数字
    val age = readInt() // 判断如果不是Int 将报错
    printf("Hello %s ! your age is %d",name,age)











  }
}
