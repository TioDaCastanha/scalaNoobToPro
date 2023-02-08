package beecrowd

import scala.io.StdIn.readLine

object bee1020 extends App {

  val idade: Int = readLine().toInt

  converterIdade(idade)

  private def converterIdade(idade: Int): Unit ={
    val ano: Int = idade / 365
    val mes: Int = idade % 365 / 30
    val dia: Int = (idade % 365) % 30

    println(s"$ano ano(s)")
    println(s"$mes mes(es)")
    println(s"$dia dia(s)")
  }

}
