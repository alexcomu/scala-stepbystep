// default superClass is AnyRef.
trait Philosophical {
    def philosophize() = {
        println("I consume memory, therefore I am!")
    }
}

class Frog extends Philosophical{
    override def toString = "green"
}

val frog = new Frog 
frog.philosophize()

// Used as type
val phil: Philosophical = frog
phil.philosophize()

// Mixing
class Animal
trait HasLegs

class Dog extends Animal with Philosophical with HasLegs{
    override def toString = "brown"
    override def philosophize() = {
        println("It ain't be easy being " + toString + "!")
    }
}

val d = new Dog
d.philosophize()
