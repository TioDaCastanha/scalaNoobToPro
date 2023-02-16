package poo

object covariantes extends App {

  val animal: Carnivore = new GatoDoMato
  val animalList: Lista[Carnivore] = new Lista[GatoDoMato]

}

class Carnivore
class GatoDoMato extends Carnivore
class Cachorro extends Carnivore

class Lista[+B] //Covariante necessario o + na frente do tipo genérico. Desta forma permite adições de Variantes filhas
