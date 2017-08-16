package wuliangliang

import scala.util.Random

/**
  * Created by doubling on 2017/8/8.
  */
object ttt extends App{
  println("fdsfs")

  Short.MaxValue

  //数值类型转换

  "100".toInt

  Integer.parseInt("100",4)

  implicit class StringtoInt(s:String){

    def toInt(redis:Int) =Integer.parseInt(s,redis)

  }
  "100".toInt(2)

    //异常
  def toInt(s:String):Option[Int]={

    try{
      Some(s.toInt)
    }catch {
      case e:NumberFormatException=>None
    }
  }
  println(toInt("11").getOrElse(0))

  val result = toInt(String) match {
    case Some(n)=>println(n)
      case(None)=>println(0)
  }
  val a  = 100L
  a.isInstanceOf[Int]

  //给变量增加类型
  val b = 0:Byte

  val c:Short =0;

  //不支持++  -- 但是支持+=  -=
  var aa = 1;
  aa+=1

  // 浮点数比较
   def isEq(x:Double,y:Double,precision:Double)={
     if((x-y).abs<precision) true else false
   }

  val r = Random;
  r.nextInt(100)

  for(i<- 0 to r.nextInt(10)) yield i*2

  val l = 0 to 10 toArray
  val lq = 0 to 10 toList

  val pi = scala.math.Pi
  println(f"$pi%1.5f")


}
