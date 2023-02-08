package introducao

import scala.util.Random

object tryCatch extends App {

  val num = Random.nextInt(4)

  def find1(um: Int): Unit = {
    um match {
      case 1 => println("Achou o um!!")
    }
  }

  try {
    find1(num)
  } catch {
    case e: MatchError => println("Deu ruim parceiro!!")
  }

}
