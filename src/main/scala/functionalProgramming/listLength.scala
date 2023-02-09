package functionalProgramming

object listLength extends App {

  val list = List(3, 2, 4, 6, 5, 7, 8, 0, 1)

  def f(arr: List[Int]): Int = arr.indices.toList.last + 1

  print(f(list))

}
