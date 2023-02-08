package introducao

import scala.util.Random

object ex2 extends App{

  val num1 = Random.nextInt(101)
  val num2 = Random.nextInt(101)

  val maior = if(num1 > num2) num1 else num2

  println(s"Entre $num1 e $num2 o $maior é maior!")

}
