package functionalProgramming

object compareTriplets extends App {

  val a = Array(17, 28, 30)
  val b = Array(99, 16, 8)
  def f(a: Array[Int], b: Array[Int]): Array[Int] = {
    val resultado = new Array[Int](2)
    resultado(0) = a.map(x => if (x > b(a.indexOf(x))) 1 else 0).sum
    resultado(1) = b.map(x => if (x > a(b.indexOf(x))) 1 else 0).sum
    resultado
  }

  print(f(a, b).mkString(" "))


}
