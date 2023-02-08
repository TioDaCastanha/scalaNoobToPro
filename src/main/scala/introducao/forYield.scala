package introducao

import scala.collection.mutable.ListBuffer


object forYield extends App {

  val list = List(1,2,3)

  for(i <- 1 to 3) println("oi tudo bem!")

  println(list)

  val list2 = list.map(x => x + 1)

  println(list2)

  var list3 = new ListBuffer[Int]

  for (i <- list) list3 += i * 2

  println(list3)

  var list4 = for (i <- list) yield i * 3

  println(list4)

  val list5 = for {
    i <- List(2, 3, 4)
    j <- List(4, 5, 6)
  }yield i * j

  println(list5)

  val list6 = for{
    i <- List(2,3,4)
    j <- List(4,5,6)
    k = i * j
    if k % 2 == 0
  } yield k

  println(list6)



}
