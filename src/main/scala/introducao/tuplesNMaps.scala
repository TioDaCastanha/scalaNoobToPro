package introducao

object tuplesNMaps extends App {

  val aTuple = ("Bob", "Human")

  println(aTuple._2)
  println(aTuple.copy(_2 = "Alien"))//.copy muda a visualização mas não o conteúdo da tupla
  println(aTuple.swap)//.swap funciona apenas em Tuples e não em Triples

  val aMap = Map("Bob" -> "Earth", ("Marvin", "Mars")).withDefaultValue("Not Found")// Primeiro valor Key segundo valor Value

  println(aMap)
  println(aMap.contains("Juan"))
  println(aMap("Juan"))
  
}
