package functionalProgramming

import scala.io.StdIn.readInt

object arrayNElements extends App{
  def f(num: Int): List[Int] = {
    val list = List.range(0,num)

    println(list)
    list
  }

  println(f(readInt))
}
