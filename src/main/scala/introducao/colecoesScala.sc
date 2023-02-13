//Arrays -> Mutável, seu conteúdo pode ser alterado
val numeros = Array(1, 1, 2, 3, 4)

numeros(3) = 100

numeros

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


