package poo

object POOscala4 extends App {

  val user1 = new UsuarioMidia
  println(user1.facebook)
  println(user1.eMidia)
}

abstract class MidiaSocial{
  val facebook: String
  def eMidia: Boolean
}

class UsuarioMidia extends MidiaSocial with Idade with Genero { //Classes podem herdar varias Traits
  val facebook = "Não tenho facebook"
  override val idadeUsoMediaSocial: Int = 12
  override val genero = "Homem ou Mulher"
  def eMidia = false
  override def idadeMinimaUso: Int = 10
}

//Traits são "comportamentos". Tambem pode possuir valores abstratos
trait Idade {
  val idadeUsoMediaSocial: Int

  def idadeMinimaUso: Int
}

trait Genero{
  val genero:String

}

