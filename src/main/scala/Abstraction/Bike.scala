package Abstraction

abstract class Bike {
  def run()
}
class Hero extends Bike {
  def run(): Unit = {
    println("running Fine...")
  }
}
object Main7 {
  def main(args: Array[String]): Unit = {
    var h = new Hero()
    h.run
  }
}
