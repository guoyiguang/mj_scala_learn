package chapter02

import java.io.FileNotFoundException

import scala.xml.MalformedAttributeException

object section3 {
  def main(args: Array[String]): Unit = {
    // ------------------------------懒值----------------------------------
    // 当val被声明为lazy时，它的初始化将被推迟，直到我们首次对它取值。
    lazy val words = scala.io.Source.fromFile("./words.txt").mkString
    // 懒值并不是没有额外开销。我们每次访问懒值，都会有一个方法被调用，而这个方法将会以线程安全的方式检查该值是否已被初始化

    // ------------------------------异常----------------------------------
    // throw表达式有特殊的类型 Nothing . 这在if/else中很有用。如果一个分支的类型是nothing，那么if/else 表达式的类型就是另一个分支的类型。
    val x = 2
    if (x>0) {
      math.sqrt(x)
    }else throw new IllegalArgumentException("x should not be begative")
    // 以上，第一个是Double 第二个分支是Nothing。因此 if/else 表达式类型是Double

    // 捕获异常通常使用模式匹配的语法http:

    try{
        val words = scala.io.Source.fromFile("./words.txt").mkString
    }catch {
      case _:MalformedAttributeException => println("aaaaaaa")
      case ex:FileNotFoundException => print("can't find file")
    }finally {
      print("最终都会执行 一般用来关闭资源")
    }





  }
}
