package wuliangliang
import scala.io
/**
  * Created by doubling on 2017/8/14.
  */
object scalaClass {

  //为case 类生成辅构造函数
  case class p(var name:String,var age :Int)
  val p1 = p("wulainglang",12)

  //其实调用case类的伴生对象的apply方法，

  class pp(var name:String,var age :Int)
  object  pp{
    def apply() =  new pp("gdsfs",0)
    def apply(name:String) =  new pp(name,0)
  }

  val p2= pp()


  //设置构造函数参数的默认值
  class  Socket(val timeout:Int = 1000)
  //等价于
  //
  class Socket1(val timeout:Int){
    def this() = this(10000)
  }

  //getter  和  setter

  // 常见的方法是在参数名前添加一个下划线

  class per(private var _name:String){

    def name = _name

    //getter
    def name_= (sa:String) {this.name = sa}

  }

  // 将代码块或者函数赋值给字段

  class Foo{
    var text = {
      var lines = ""
      try{
        lines = io.Source.fromFile("/home/desk").getLines.mkString
      }catch {
        case e:Exception =>lines="Error Happened"
      }
      lines
    }
    println(text)
  }

  //赋默认值
  case class Address(city:String,state:String)
  case class usr(var username:String, var  password:String){
    var age = 0 ;
    var name =  ""
    var address =None : Option[Address]
  }

  //在继承类时处理构造函数


  class person(var name:String ,var age:Int )

  class Emploee(name:String,age:Int,var address: Address) extends person(name ,age)

  //在子类的辅助构造函数中，无法直接控制调用哪个超类构造函数，事实上，因为每个辅助构造函必须调用同一类中之前已经定义好的构造函数，
  // 所有的辅助构造函数最终会通过子类主构造函数的主构造函数题调用同一个超类的构造函数

  /*
   什么时候使用抽象函数
   （1）需要创建一个有构造函数参数的基类（特质中，不允许有构造函数参数）
   （2）需要被java调用
   */

}
