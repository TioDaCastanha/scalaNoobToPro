package poo

object POOscala2 extends App {

  val autor = new Autor("Bob", "of Bobs", 1999)
  val livro = new Livro("A Bob Fellings", 2020, autor)

  println(autor.nomeCompleto)
  println(livro.idadeAutor())
  livro.escritoPor()
  println("O livro foi lançado em: " + livro.anoLancamento)
}

class Autor(nome: String, sobrenome: String, val anoNascimeno: Int){

  def nomeCompleto: String = nome + " " + sobrenome

}

class Livro(nome: String, val anoLancamento: Int, autor: Autor){

  def idadeAutor(): Int = anoLancamento - autor.anoNascimeno
  def escritoPor(): Unit = println(s"O livro '$nome' foi escrito por " + autor.nomeCompleto)

}