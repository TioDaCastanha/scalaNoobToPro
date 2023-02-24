package problemsSolving

object BirthdayCakeCandles extends App {

  val n = io.StdIn.readLine().toInt
  val arr = io.StdIn.readLine().split(" ").map(_.toLong)
  val max = arr.max
  val qtd = arr.collect { case x if x == max => x }.length

  println(qtd)

}
