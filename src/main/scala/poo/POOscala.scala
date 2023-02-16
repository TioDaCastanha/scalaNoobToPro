package poo

object POOscala extends App {

  val bob = new Pessoa("Bob",33)
  val billy = new Pessoa("Billy", 36)

  println(bob.idade)
  println(s"Altura do Bob: ${bob.altura}")

  bob.apresentacao("Alan")
  bob.apresentacao("Liz", "Silva")//overloaded
  bob.despedida()

  bob.apresentacao("Gerome") //Without Infix
  bob apresentacao "Skitter" //Infix Notation apenas para métodos com apenas um parâmetro.

  println(bob saiuCom billy) //outro Infix
  println(bob.-())
  println(bob.apply())
  println(bob())//Syntactic Sugar

  println((billy - "de Bills")())//Overload com apply

  //Operadores matemáticos em Scala são metodos em Infix
  println(1 + 2) //Com Infix
  println(1.+(2)) //Sem Infix

}
class Pessoa(val nome: String, val idade: Int) {
  val altura = 1.70f

  def apresentacao(nome: String): Unit = println(s"Olá $nome, meu nome é ${this.nome}")
  def apresentacao(nome: String, sobrenome: String): Unit = println(s"Olá $nome $sobrenome, meu nome é ${this.nome}")//overloaded
  def despedida(): Unit = println(s"Adeus, até outro dia!! Não se esqueça, meu nome é $nome")
  def saiuCom(pessoa: Pessoa): String = s"${this.nome} saiu com ${pessoa.nome}"

  //é possivel usar simbolos de operações em nomes de métodos
  def -(): String = s"${this.nome} está sozinho"
  def -(sobrenome: String) = new Pessoa(s"$nome $sobrenome", 35)

  //Apply -> método sem parametros
  def apply(): String = s"meu nome é $nome e tenho $idade anos"

}