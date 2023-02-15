package introducao

object funcaoAnonima extends App {

  val duplicar = (x: Int) => x * 2
  println(duplicar(3))

  //Ou

  val triplicar: Int => Int = x => x * 3
  println(triplicar(3))

  //Outro Exemplo

  val soma = (a: Int, b: Int) => a + b
  println(soma(3,6))

  val subtrair: (Int, Int) => Int = (a, b) => a - b
  println(subtrair(6,3))


}
