package functionalProgramming

object filterArray extends App {

  val delim = io.StdIn.readLine().toInt

  val list = List(1, 2, 3, 4, 5, 6, 7, 8)
  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)

  print(f(delim, list))

}
