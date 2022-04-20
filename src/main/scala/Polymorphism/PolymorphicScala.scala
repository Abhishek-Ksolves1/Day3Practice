package Polymorphism

class PolymorphicScala {
  def func(a: Float): Unit = {}
  def func(a: Float, b: Float): Unit = {
    var div = a / b
    println("Division:" + div)
  }
  def func(a: Float, b: Float, c: Float): Unit = {
    var add = a * b * c
    println("Addition: " + add)
  }
}
object Main5 {
  def main(args: Array[String]): Unit = {
    var obj = new PolymorphicScala()
    println("Polymorphic Method in Scala")
    obj.func(500, 15)
    obj.func(37.5f, 2.4f, 9.0f)
  }
}
