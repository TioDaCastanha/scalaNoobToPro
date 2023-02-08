package introducao

import scala.util.Random

object ex5 extends App{

  val x: Int = Random.between(1,11)

  println(x)

  def funcao(x: Int): Int ={
    x match {
      case 4 => 3
      case x if x < 4 => x + 2
      case x if x >= 6 => 6 - x
      case 5 => -1
    }
  }

  println(funcao(x))

}
