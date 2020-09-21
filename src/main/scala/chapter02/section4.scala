package chapter02

object section4 {
  /*
     * 2.1
     * 一个数字如果为正数，则它的signum为1;
     * 如果是负数,则signum为-1;
     * 如果为0,则signum为0.编写一个函数来计算这个值
     * */
  def signum1(x: Int): Int = {
    if (x > 0) 1
    else if (x < 0) -1
    else 0
  }
  def signum2(x:Int) = if(x>0) 1 else if (x<0) -1 else 0
  /*
     * 2.2
     * 一个空的块表达式{}的值是什么？类型是什么？
     * */


  def emptyBlock()={
    print({})
    println({}.getClass)
  }

  /*
   * 2.3
   * 指出在Scala中何种情况下赋值语句x=y=1是合法的。
   * (提示：给x找个合适的类型定义)
   */
  def checkAssignLegal: Unit ={
    var x:Unit = ()
    var y = 1
    x = y = 1
  }
  /*
   * 2.4
   * 针对下列Java循环编写一个Scala版本:
   * for(int i=10;i>=0;i–)System.out.println(i);
   */
  def scala_circulation1={
    for (i<-1 to 10){
      println(11-i)
    }
  }
  def scala_circulation2={
    (1 to 10 reverse).foreach(println)
  }
  /*
     * 2.5
     * 编写一个过程countdown(n:Int)，打印从n到0的数字
     */

  def countdown(n:Int): Unit ={
    n match {
      case n if n>=0 =>{
        (0 to n reverse).foreach(println)
      }
      case n if n<0 =>{
        (n to 0).foreach(println)
      }
    }
  }

  /*
   * 2.6
   * 编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。
   * 举例来说，"Hello"中所有字符串的乘积为9415087488L
   */
  def calculateCharsUnicodeProduct(s:String) ={
    var res:Long = 1
    for (x<-s){res *= x.toLong}
    res
  }
  // 2.9
  def question9(x:Int,n:Int):BigInt={
    n match {
      case 0 =>1
      case n if n<0 => 1/question9(x,-n)
      case n if n%2 == 0 => question9(x,n/2) pow(2)
      case n if n%2 == 1 => x * question9(x,n-1)
    }
  }



  def main(args: Array[String]): Unit = {
    println(signum1(3))
    println(signum2(-1))
    println(emptyBlock())
    checkAssignLegal
    scala_circulation1
    scala_circulation2
    print(calculateCharsUnicodeProduct("Hello"))


  }



}