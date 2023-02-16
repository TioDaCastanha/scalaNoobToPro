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

class UsuarioMidia extends MidiaSocial{
  val facebook = "Não tenho facebook"
  def eMidia = false
}
