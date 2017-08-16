package wuliangliang

/**
  * Created by doubling on 2017/8/16.
  */
object method {

  //方法，返回值不是必须的，方法体很短时，括号也不是必须的
  // 对象似有作用域    private[this]
  //私有作用域当前实例和当前类的其他实例可见
  // 保护作用域，对子类可见
  //包级别作用域  private[包]
  //如果类继承了多个特质，在使用super调用父类方是，不仅要选择调用的方法，还要选择要调用的特质 super[特质]


  //偏向于在调用方法时指定参数名

   //返回多个值，可以将值包装成一个对象，也可以使用tuples

  def getSocketInfo=("fdsfs",1111)
  val (sym , cur) = getSocketInfo
  val reu = getSocketInfo
  reu._1
  reu._2

  //定义getting和setting方法时。在方法后面去掉括号，会强制类的消费者在调用方法时不使用括号
  class piaa{
    def curSize = 12
  }

  val ppp= new piaa
  // ppp.curSize()报错
  ppp.curSize

  //创建接受参数的方法

  def printAll(strings : String*){
    strings.foreach(println)
  }


  //使用_*来适配一个序列

  /*
   * 方法的异常声明
    *
    * @throws(classOf(Exception)
   */

  //支持链式调用编码风格
  //1,如果类可能会被扩展，则把this.type作为链式调用风格方式的返回值，
  //2，如果类不会被扩展，则使用this从链式调用方法中返回出来

}
