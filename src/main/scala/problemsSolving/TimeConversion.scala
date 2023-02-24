package problemsSolving

object TimeConversion extends App {

  val time = io.StdIn.readLine()

  val arr = time.split(":")

  println(timeConversion(arr))

  def timeConversion(arr: Array[String]): String = {
    if (arr.last.contains("PM")) {
      if (arr.head.toInt == 12) arr.mkString(":").substring(0, 8)
      else arr.head.toInt + 12 + ":" + arr.tail.mkString(":").substring(0,5)
    } else {
      if (arr.head.toInt == 12) "00:" + arr.tail.mkString(":").substring(0,5)
      else arr.mkString(":").substring(0, 8)
    }
  }

}
