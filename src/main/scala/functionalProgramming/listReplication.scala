package functionalProgramming

object listReplication extends App {

  val num = io.StdIn.readLine().toInt
  val list = List(1, 2, 3)
  def f(num:Int,arr:List[Int]):List[Int] = arr.flatMap(x => Seq.fill(num)(x))

  println(f(num,list).mkString("\n"))

}
