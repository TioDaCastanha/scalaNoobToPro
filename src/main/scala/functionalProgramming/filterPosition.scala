package functionalProgramming

object filterPosition extends App {

  val list = List(8, 15, 22, 1, 10, 6, 2, 18, 18, 1)
  def f(arr:List[Int]):List[Int] = arr.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)

  print(f(list))

}
