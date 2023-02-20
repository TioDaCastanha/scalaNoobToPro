package functionalProgramming

import scala.annotation.tailrec

object evaluating_e_x extends App {

  val stdin = scala.io.StdIn

  val n = stdin.readLine.trim.toInt
  def fatorial (x: Int): Int = (1 to x).product

  for (nItr <- 1 to n) {
    val x = stdin.readLine.trim.toDouble
    printf("%.4f\n", (2 to 9).map(a => math.pow(x, a) / fatorial(a)).toList.sum + 1 + x)
  }

}
