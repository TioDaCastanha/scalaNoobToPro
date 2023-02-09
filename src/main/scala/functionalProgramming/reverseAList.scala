package functionalProgramming

object reverseAList extends App{

  val list = List(1, 2, 3, 4, 5, 6)
  def f(arr:List[Int]):List[Int] = arr.reverse

  println(f(list))

}
