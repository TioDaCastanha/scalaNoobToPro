package functionalProgramming

object challenge extends App{

  //println(ArrayChallenge(scala.io.StdIn.readLine().toArray))
  ArrayChallenge(Array(17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7))

  def ArrayChallenge(arr: Array[Int]): Int = {
    val arrTail = arr.tail
    val tailList = arrTail.flatMap(x => arrTail.tail.map(y => if (x + y == arr.head) (x, y) else - 1))
    print(tailList.filter(_ != -1).toList.mkString(" ").filterNot(_ == ')').filterNot(_ == '('))
    arr(0)
  }

}
