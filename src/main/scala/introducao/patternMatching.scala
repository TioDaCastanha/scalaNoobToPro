package introducao

import scala.util.Random

object patternMatching extends App {

  val dia = Random.between(1,32)
  val diaMes = (dia, Random.between(1,13))

  def mesNome(diaMes: (Int, Int)): Unit = {
    diaMes match {
      case (x, 1) => print(s"dia $x de Janeiro")
      case (x, 2) => print(s"dia $x de Fevereiro")
      case (x, 3) => print(s"dia $x de Março")
      case (x, 4) => print(s"dia $x de Abril")
      case (x, 5) => print(s"dia $x de Maio")
      case (x, _) => print(s"dia $x de Qualquer coisa")
    }
  }

  mesNome(diaMes)

}
