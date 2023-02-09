package functionalProgramming

object updateList extends App {

  val list = List(2, -4, 3, -1, 23, -4, -54)
  def f(arr:List[Int]): List[Int] = arr.map(x => if (x < 0) x * -1 else x) // Also works .map(Math.abs(_))

  print(f(list))

}
