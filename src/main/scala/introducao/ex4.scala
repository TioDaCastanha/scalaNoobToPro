package introducao

import scala.annotation.tailrec
import scala.util.Random

object ex4 extends App {

  val num1 = Random.nextInt(101)
  val num2 = Random.nextInt(101)

  def min(a: Int, b: Int): Int = if(a > b) b else a

  val menor = min(num1, num2)

  println(menor)

  @tailrec
  def mdc(a: Int, b: Int, menor: Int): Int ={
    if (a % menor == 0 && b % menor == 0) menor
    else mdc(a, b, menor - 1)
  }

  print(s"O MDC de $num1 e $num2 é: ")
  println(mdc(num1, num2, menor))

}
