package introducao

import scala.util.Random

object ex1 extends App{

  val num: Int = Random.nextInt(101)
  val parOuImpar: String = if (num % 2 == 0) s"O num $num é Par!" else s"O num $num é Impar!"

  println(parOuImpar)

}
