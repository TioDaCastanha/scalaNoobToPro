package problemsSolving

import scala.annotation.tailrec

object Staircase extends App {

  val n = io.StdIn.readLine().toInt
  val arr = (1 to n).map(_ => " ").toArray

  staircase(arr:+"#")

  @tailrec
  def staircase(arr: Array[String]): Unit = {
    if(arr.head == " "){
      println(arr.tail.mkString(""))
      staircase(arr.tail:+"#")
    }
  }

}
