package poo

object classesGenericas extends App {

  val listaInt = new MinhaLista[Int]
  val listaString = new MinhaLista[String]
  val listaVaziaInt = MinhaLista.vazia[Int]

}

//Classes Genericas
class MinhaLista[A]{ //É possivel atribuir qualquer tipo de dado e podemos diferenciar com letras como A, B, C...

}

class MyMap[Key, Value]{

}

object MinhaLista{
  def vazia[A]: MinhaLista[A] = new MinhaLista[A] //Metodo Generico
}
