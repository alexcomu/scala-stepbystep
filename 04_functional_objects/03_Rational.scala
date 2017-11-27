// Adding Fields
// To use n and d we have to create members
// Only after the declaration we have access to it

// Add Method
// Receive a Rational object and since Rational is immutable
// we return a new Rational Object with the sum

class Rational(n: Int, d: Int){
    require(d != 0)
    val numer: Int = n
    val denom: Int = d
    // Override the toString method, use the members!
    override def toString = numer + "/" + denom
    def add(that: Rational): Rational = 
        new Rational(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )
}

val r1 = new Rational(3,4)
println("First Rational " + r1.numer + "/" + r1.denom)
val r2 = new Rational(4,3)
println("Second Rational " + r2)
println("Sum result: " + r1.add(r2))
println(r1 add r2) 
