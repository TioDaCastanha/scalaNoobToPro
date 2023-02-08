package introducao

import scala.util.Random

object ex3 extends App {

  val x = Random.between(-101, 101)
  val y = Random.between(-101, 101)

  val quadrante = {
    if(x < 0 && y > 0) 2
    else if (x > 0 && y > 0) 1
    else if (x > 0 && y < 0) 4
    else if (x < 0 && y < 0) 3
    else 0
  }

  println(s"A coordenada ($x, $y) está no quadrante ${quadrante}º")
}
