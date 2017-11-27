// Self reference

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
    def lessThan(that: Rational): Boolean = 
        this.numer * that.denom < that.numer * this.denom
    def max(that: Rational): Rational = 
        if (lessThan(that)) that else this
}

val r1 = new Rational(3,4)
println("First Rational " + r1.numer + "/" + r1.denom)
val r2 = new Rational(4,3)
println("Second Rational " + r2)
println("Sum result: " + r1.add(r2))
print("Sum Again: ")
println(r1 add r2) 
println("Testing lessThan")
println("r1 is less than r2? " + r1.lessThan(r2))
println("Max Value: " + r1.max(r2))
