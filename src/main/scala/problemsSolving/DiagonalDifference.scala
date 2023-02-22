package problemsSolving

object DiagonalDifference extends App{

  val n = io.StdIn.readLine().toInt
  val matrix = Array.ofDim[Int](n, n)


  (0 until  n) foreach(i => {
    val list = io.StdIn.readLine().split(" ").map(_.toInt).toList
    (0 until n) foreach(j => {
      matrix(i)(j) = list(j)
    })
  })

  val listDiagonal1 = matrix.map(x => x(matrix.indexOf(x))).toList
  val listDiagonal2 = matrix.map(x => x.reverse(matrix.indexOf(x))).toList

  //val resultado = somaDiagonal(matrix())

  println(somaDiagonal(listDiagonal1,listDiagonal2))

  def somaDiagonal(list1: List[Int], list2: List[Int]): Int = (list1.sum - list2.sum).abs


}
