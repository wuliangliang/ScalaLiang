package wuliangliang
import scala.annotation.switch
import util.control.Breaks._
/**
  * Created by doubling on 2017/8/8.
  */
object testFor extends App{
  //循环计数器
  val a= Array("a","b","c")
  for((e,count)<- a.zipWithIndex){
    println(s"$count is $e")
  }
  //注意s和f的区别

  //卫语句
  for(i <- 0 to  10 if i<4 ) yield println(i)

  //遍历map

  val m=  Map("aa"->"ab","bb"->"ba","cc"->"cd")
  for((key,value)<- m) println(s"$key,$value")
  //当使用yiedld组合时，他构建并返回一个新的集合，不使用yield时，仅仅是对集合中的每个元素，进行了操作，但是没有返回新的集合


  a.foreach{e =>
    val aa = e.toLowerCase
    println(aa)
  }
  //在if中使用多个计数器
  for {
    i <- 0 to 10;
    j <- 0 to 10
  }println(s"i=$i,j=$j")

  for{
    i <- 0 to 10
    if i>3
    if i<6
    if i%2==0
  }println(i)

  //break and continue

  breakable{
    for(i<- 1 to 10){
      println(i)
      if(i>4) break()
    }
  }

  val searchMe = "per pere prerewp werwe"
  var num = 0;
  for(i<-searchMe.length){
    breakable(
      if(searchMe.charAt(i)!='p')
        break()
      else{num+=1}
    )
  }
  println(num)


  //三元运算符
  val aaa =1
  val absa = if( aaa < 0 ) -aaa else aaa

  //switch
  val aa = aaa match {

    case 1=> "fdsf"
    case 2=>"fsdfsd"

    case _=>"gfsdfdsf"
  }

  //  推荐使用注解
  val aaaaa = (aaa: @switch) match {

    case 1=> "fdsf"
    case 2=>"fsdfsd"
    case _=>"gfsdfdsf"
  }

  //一条case语句匹配多个条件
  //使用管道符  |

  def isTrue(a:Any) = a match {
    case 0|"" => false
    case _ => true
  }

  //可以给缺省匹配指定一个变量名

  //在匹配表达式 中可以匹配多种匹配模式，可以是常量，变量，集合，元组等等

  /*
  * 给模式添加变量
  *
  * variableName @ pattent
  *
  * case list : @ List(1,_*)
  *
  * */

  //在匹配表达式中使用some和None

  def toInt(s:String) :Option[Int] ={
    try{
      Some(Integer.parseInt(s))
    }catch {
      case e:Exception=>null
    }
  }

  toInt("42") match {
    case Some(i) =>println(i)
    case None =>println("none")
  }

  //case 中使用卫语句
  //使用匹配表达式，替换isInstanceOf
  class Person(){}

  def idPerson(x:Any):Boolean ={

    x match {
      case p:Person =>true
      case _=>false
    }
  }

  /*
  * 在匹配表达式中使用List
  * List由Nil结尾
  * */

  //实现一个递归算法
  def listToString(list:List[String]):String ={
    list match {
      case s :: rest => s + " " + listToString(rest)
      case Nil => ""
    }
  }

  //使用case匹配多个异常



}
