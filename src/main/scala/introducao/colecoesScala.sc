//Arrays -> Mutável, seu conteúdo pode ser alterado
val numeros = Array(1, 1, 2, 3, 4)

numeros(3) = 100

numeros

val aString = "1 2 3 4"
val aArray = aString.split(" ").map(_.toInt)

//List -> Imutável, seu conteúdo não pode ser alterado
val numeros2 = List(1, 1, 2, 3)

//numeros2(3) = 100
numeros2

val aList = List(1, 2, 3, 4)
val aListHead = aList.head
val aListTail = aList.tail
val aListMap = aList.map(x => x * 2)
val aListFilter = aList.filter(x => x % 2 == 0)

val par = (x: Int) => List(x, x + 1)

val aListMap2 = aList.map(par)
val aListFlatMap = aList.flatMap(par)

val inteiros = List(1, 2, 3, 4)
val char = List('a', 'b', 'c', 'd')

val aListMix = inteiros.flatMap(x => char.map(y => "" + y + x))

//Set -> Imutável, não preserva a ordem dos elem. inseridos e não permite repetições
val aSetList = Set(1,3,2,1,5,8)

aSetList

//Tuplas
val aTuple = ("Bob", 20)

aTuple._1
aTuple._2

val (nome, idade) = aTuple

nome
idade

//Sequencias -> tem ordem de elementos bem estabelecidas.
//Pode escolher como apresentar os valores -> List, Array, Set....
val aSeq = Seq(3, 5, 4, 2, 1)

aSeq
aSeq.reverse

val aNewSeq = aSeq ++ Seq(7,8,6)

aNewSeq
aNewSeq.sorted

//Maps -> podem armazenar qualquer tipo de dado, Imutável
val aPersonMap = Map("nome" -> "Alan", "idade" -> 33, "altura" -> 1.70)

aPersonMap.keys
aPersonMap.values

//Option -> se existir valor devolve Some, caso não tenha devolve None
val aMap = Map("Bob" -> 33, ("Alan", 66))

aMap.get("Bob")
aMap.get("Liz")

def procedimento1(): Option[String] = None //Some("Alguma coisa")
def procedimento2(): Option[String] = Some("Outra Coisa")

val resultado = procedimento1() orElse Some("Nenhuma Coisa") //procedimento2()