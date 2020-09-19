package chapter02

object section2 {
  def main(args: Array[String]): Unit = {

    // ------------------------------循环-----------------------------------
    // while do 循环
    var n = 3
    var r = 1
    while (n>0){
      r = r * n
      n -= 1
    }
    // for 语句
    for (i<-1 to n){ // 1 to n 这个调用返回数字 1 到 数字 n 的range区间。 for(i <- 表达式） 会让i 遍历 表达式中的所有值
      r = r*i
    }
    // until 语句
    // 遍历字符串或数组时，通常需要使用从0 到 n-1的区间。这个时候可以用 until 方法而不是to方法。 util返回一个并不包含上限的区间
    val s = "Hello"
    var sum = 0
    for (i <- 0 until s.length) {
      print(i)
      sum+=s(i)
    }
    for (ch <- "Hello") {
      print(ch)
      sum+=ch
    }

    // ------------------------------高级for循环和for推导式----------------------------------
    // 你可以以 变量<-表达式的形式提供多个生成器 用分号将他们隔开
    for(x<- 1 to 3; y<- 1 to 3) print((10*x+y) + " ")
    // 每个生成器都可以带一个守卫，以if 开头的Boolean 表达式
    for(i<-1 to 3; y <-1 to 3 if i!=y) print((10*i+y) + " ")
    // 你可以使用任意多的定义，引入可以在循环中使用的变量
    for (i<-1 to 3; from = 4-i;j<-from to 3) print((10*i+j)+" ")
    // 如果for 循环的循环体以yield 开始，则该循环会构造出一个集合，每次迭代会生成集合中的一个值
    val rr = for (i<-1 to 10 ) yield i *2
    print(rr)
    // 这类循环叫做for推导式。for推导式生成的集合与它的第一个生成器是类型兼容的
    val cc = for (c<-"Hello";i<-0 to 1) yield (c+i).toChar
    print(cc)  // 将生成"HIeflmlmop"
    val dd = for(c<-0 to 1;i<-"Hello") yield(c+i).toChar
    print(dd)

  }
  // ------------------------------函数----------------------------------
  // 要定义函数，你需要给出函数的名称、参数和函数体 如以下。 你必须给出所有参数的类型，不过只要不是递归，就不要指定返回类型。scala编译器能够根据 = 符号右侧的表达式的类型推断出返回类型
  def abs(x:Double) = if(x>=0) x else -x
  // 如果函数需要多个表达式，那么可以使用代码块。块中最后一个表达式的值就是函数的返回值。即r
  def fac(n:Int) = {
    var r = 1
    for (i<-1 to 10)
      r = r*i
    r
  }
  //------------------------------默认函数和带名参数----------------------------------
  // 我们在调用某些函数时并不显式地给出所有参数值，对于这些函数我们可以使用默认参数。
  def decorate(str:String,left:String="[",right:String="]")=
    left+str+right

  // ------------------------------变长参数----------------------------------

  def sum(args:Int*) ={
    var result = 0
    for (arg<-args) result +=arg
      result
  }
  // 可以使用任意多的参数来调用该函数
  val s = sum(1,2,3,4)
  printf("变长参数的和为：%d",s)
  // sum(1 to 5) 是错误的 如果sum函数被调用时传入的是单个参数，那么该参数必须是单个整数，而不是一个整数区间。解决方法是告诉编译器你希望这个参数被当做参数序列处理 追加 _*
  val s2 = sum(1 to 3:_*)
  // ------------------------------过程----------------------------------
  // scala对于不返回值得函数有特殊的表示法。如果函数体包含在花括号中，但是没有前面的=号，那么返回类型就是Unit。这个的函数就被称为   过程
  def box(s:String): Unit ={
    var border = "-" * s.length+"--\n"
    println(border+"|"+s+"|\n"+border)
  }
  box("hello")



}
