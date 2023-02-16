package poo

object POOscala3 extends App {

  val bob = new Gato
  bob.comer()
  bob.leite()

  val billy = new Aluno("Billy", 32)
  billy.apresentacao()

}
//Superclasse
class Animal{
  def comer(): Unit = println("Comendo...")
  protected def beber(): Unit = println("Bebendo...")//protected é acessivel apenas pela mãe e pelas classes filhas.
  private def lamber(): Unit = println("Lambendo") //private é acessivel apenas no escopo onde foi criado
}

class Humano(nome: String, idade: Int){
  def apresentacao(): Unit = println(s"Olá meu nome é $nome e tenho $idade anos.")
}

//Subclasse
class Gato extends Animal {
  def leite(): Unit = beber()

}

//Classe Abstrata
abstract class Elefante{
  val peso: Double
  def podeVoar: Boolean
}

class Aluno(nome: String, idade: Int) extends Humano(nome, idade + 1){
  override def apresentacao(): Unit = println(s"Olá meu nome é $nome.")//Override sobrescreve metodo da superclasse
}