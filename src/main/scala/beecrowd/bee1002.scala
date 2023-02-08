package beecrowd

import scala.io.StdIn.readLine

object bee1002 extends App {

  val pi = 3.14159

  val area: Double = {
    val raio = readLine().toDouble
    pi * (raio * raio)
  }

  printf("A=%.4f\n",area)

}
