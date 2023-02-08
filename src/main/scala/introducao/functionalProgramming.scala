package introducao

object functionalProgramming extends App {


  //Imperativo

  private def imprime(args: Array[String]):Unit ={
    var i = 0
    while(i < args.length){
      println(args(i) + " ")
      i += 1
    }
  }

  imprime(Array("Oi", "Hello", "Hola"))

  //Funcional

  val concat = new Function3[String, String, String, String] {
     override def apply(args1: String, args2: String, args3: String): String = args1 + args2 + args3
  }

  println(concat("Hola ", "Oi ", "Hello "))

}
