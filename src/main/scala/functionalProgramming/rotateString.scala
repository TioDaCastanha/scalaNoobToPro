package functionalProgramming

import scala.annotation.tailrec

object rotateString extends App{

  @tailrec
  def f(n: Int): Unit ={
    if(n > 0) {
      val string = io.StdIn.readLine().toList
      var list = string
      (1 to list.size).foreach(_ => {
        list = list.tail :+ list.head
        print(list.mkString + " ")
      })
      println()
      f(n - 1)
    }
  }

  f(2)

  //Alternative

  (1 to io.StdIn.readLine().toInt).foreach(_ => {
    val s = io.StdIn.readLine()
    println((1 to s.length).map(i => s.substring(i).concat(s.substring(0, i))).mkString(" "))
  })




}

