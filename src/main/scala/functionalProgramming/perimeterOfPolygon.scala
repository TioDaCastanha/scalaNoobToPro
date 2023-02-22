package functionalProgramming

import scala.util

object perimeterOfPolygon  extends App {

  val n: Int = io.StdIn.readLine().toInt
  val list_XY = new Array[(Double, Double)](n)

  (0 until n) foreach(i => {
    val aTupple = io.StdIn.readLine().split(" ").map(_.toDouble) match {
      case Array(a, b) => (a, b)
      case _ => throw new Exception("Entrada Invalida")
    }
    list_XY(i) = aTupple
  })

  //println("X = " + list_X.toList)
  //println("Y = " + list_Y.toList)

  printf("%.4f",calculatePerimeter(list_XY.toList))

  def calculatePerimeter(vertices: List[(Double, Double)]): Double = {
    val pairs = vertices.sliding(2).toList
    val distances = pairs.map(pair => {
      val xDiff = pair(1)._1 - pair(0)._1
      val yDiff = pair(1)._2 - pair(0)._2
      math.sqrt(math.pow(xDiff, 2) + math.pow(yDiff, 2))
    })
    val firstPoint = vertices.head
    val lastPoint = vertices.last
    val xDiff = lastPoint._1 - firstPoint._1
    val yDiff = lastPoint._2 - firstPoint._2
    val distanceToFirst = math.sqrt(math.pow(xDiff, 2) + math.pow(yDiff, 2))
    distances.sum + distanceToFirst
  }

}
