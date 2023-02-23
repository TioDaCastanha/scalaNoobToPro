package problemsSolving

object MiniMaxSum extends App {

  val arr = io.StdIn.readLine().split(" ").map(_.toLong).sorted

  println(miniMaxSum(arr.reverse.tail, arr.tail).mkString(" "))
  def miniMaxSum(sum1: Array[Long], sum2: Array[Long]): Array[Long] = Array(sum1.sum, sum2.sum)

}
