package problemsSolving

object GradingStudents extends App {

  val n = io.StdIn.readLine().toInt
  val arr = new Array[Int](n)

  val round: Int => Int = {
    case n if n == 0 || n == 5 => 0
    case last @ n if n > 5 => if (10 - last < 3) 10 - last else 0
    case last @ n if n < 5 => if (5 - last < 3) 5 - last else 0
  }

  val canRound = (a: Int) => a >= 38

  (0 until n) foreach(i => {
    arr(i) = io.StdIn.readLine().toInt
  })

  val grade = arr.map(a => {
    val lastDigit = a.toString.last.asDigit
    if (canRound(a)) a + round(lastDigit) else a
  })

  println(grade.mkString("\n"))
}
