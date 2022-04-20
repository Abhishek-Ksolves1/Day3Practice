package Abstraction

abstract class Bicycle(a: Int) {
  var b: Int = 20
  var c: Int = 25
  def run()
  def performance(): Unit = {
    println("Performance awesome")
  }
}
class Honda(a: Int) extends Bicycle(a) {
  c = 30
  def run(): Unit = {
    println("Running fine...")
    println("a=" + a)
    println("b=" + b)
    println("c =" + c)
  }
}
object MainObject8 {
  def main(args: Array[String]): Unit = {
    var h = new Honda(10)
    h.run()
    h.performance()
  }
}
