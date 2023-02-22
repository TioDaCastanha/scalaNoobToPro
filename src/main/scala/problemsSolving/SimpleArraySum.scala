package problemsSolving

import scala.io.StdIn

object SimpleArraySum extends App {

  val n = io.StdIn.readLine().toInt
  val ar = io.StdIn.readLine().split(" ").map(_.toInt)

  def simpleArraySum(ar: Array[Int]): Int = {
    ar.sum
  }

  println(simpleArraySum(ar))

}
