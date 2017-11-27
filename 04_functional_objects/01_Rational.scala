// Simple creation of a class used to represent rational numbers (fractions)
// Like for example 3/4, we need a numerator and a denominator

class Rational(n: Int, d: Int){
    // This println will be printed after the creation
    // of the instance, there isn't a constructor method
    // println("Created " + n + "/" +d)

    // Override the toString method
    override def toString = n + "/" + d
                                            
}

val r = new Rational(3,4)
println(r)
