package functionalProgramming

object areaUnderCurves extends App {

  val listA = io.StdIn.readLine().split(" ").map(_.toInt).toList
  val listB = io.StdIn.readLine().split(" ").map(_.toInt).toList
  val listX = io.StdIn.readLine().split(" ").map(_.toInt).toList
  val listAB = listA.map(x => (x, listB(listA.indexOf(x))))
  val listABX = listX.flatMap(x => listAB.map(a => a._1 * math.pow(x, a._2)))


  println(listABX.takeRight(5).sum)
  println(listABX.take(5).sum + listABX.takeRight(5).sum)


}
