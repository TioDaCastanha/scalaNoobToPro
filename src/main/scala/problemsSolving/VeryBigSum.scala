package problemsSolving

object VeryBigSum extends App{

  val n = io.StdIn.readLine().toInt
  val aLongList = io.StdIn.readLine().split(" ").map(_.toLong)

  println(aLongList.sum)

}
