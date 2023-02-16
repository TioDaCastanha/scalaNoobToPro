package poo

object classesAbstratas extends App {

  val listaVazia = Empty
  val lista = new Collection(1, listaVazia)
  val lista123 = new Collection(1, new Collection(2, new Collection(3, listaVazia)))

  println(lista.head)
  println(lista123.tail.head)
  println(lista123.add(4).head)


}

abstract class MyList{

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add (e: Int): MyList
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException()

  def tail: MyList = throw new NoSuchElementException()

  def isEmpty: Boolean = true

  def add(e: Int) = new Collection (e, Empty)
}

class Collection(h: Int, t:MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add (e: Int) = new Collection (e, this)
}