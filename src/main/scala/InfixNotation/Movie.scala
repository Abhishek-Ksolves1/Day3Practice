package InfixNotation

class Movie(Name: String, favorite: String, moviNo: Int) {
  println("Movie name: " + Name)
  println("favorite Movie:" + favorite)
  println("movie number: " + moviNo)

}
object Main {
  def main(args: Array[String]): Unit = {
    var obj = new Movie(Name = "Abhishek", favorite = "KJF", moviNo = 50)
  }
}
