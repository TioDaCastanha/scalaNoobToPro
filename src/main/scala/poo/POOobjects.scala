package poo

object POOobjects extends App {

  val user1 = Usuario
  val user2 = Usuario
  val user3 = new Usuario("Bob")
  val user4 = new Usuario("Billy")

  println(user1 == user2)//Objects pertencem a mesma Instância
  println(user1.idade)
  println(user2.idade)
  println(user1.nome(user3.nome))

  println(user3 == user4)//Class pertencem a instâncias diferentes

  val user5 = Usuario.dupla(user3, user4)
  println(user5.nome)
  println(user5.ifJump.canFly)

}

//Objects não possuem parâmetros de entrada - Singleton
object Usuario {

  def canFly: Boolean = false
  val idade: Int = 33
  var nome: String => String = (x: String) => x
  def dupla(player1: Usuario, player2: Usuario) = new Usuario("BillyBob")
}

//Classes podem possuir parâmetros de entrada
class Usuario(val nome: String) {
  val ifJump = Usuario

}
