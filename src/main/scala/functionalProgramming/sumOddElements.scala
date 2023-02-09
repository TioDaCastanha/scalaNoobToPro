package functionalProgramming

object sumOddElements extends App {

  val list = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
  def f(arr:List[Int]):Int = arr.filterNot(_ % 2 == 0).sum

  print(f(list))

}
