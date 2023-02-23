package problemsSolving

object PlusMinus extends App{

  val n = io.StdIn.readLine().toInt
  val arr = io.StdIn.readLine().split(" ").map(_.toInt)

  val plus = arr.filter(_ > 0)
  val minus = arr.filter(_ < 0)
  val zeros = arr.filter(_ == 0)

  printf("%.6f\n",ratio(plus, n))
  printf("%.6f\n",ratio(minus, n))
  printf("%.6f\n",ratio(zeros, n))

  def ratio(arr: Array[Int], n: Int): Double = arr.length/n.toDouble

}
