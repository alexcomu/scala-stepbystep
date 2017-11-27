// Defining Mixed Arithmetic operators
// Now you're able to call
// r1 * 2
// Overload methods!

class Rational(n: Int, d: Int){
    require(d != 0)
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g
    def this(n: Int) = this(n, 1)
    // Override the toString method, use the members!
    override def toString = numer + "/" + denom
    private def gcd(a: Int, b: Int): Int = 
        if (b==0) a else gcd(b, a % b)
    def + (that: Rational): Rational = 
        new Rational(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )
    def + (i: Int): Rational = 
        new Rational(numer + i, denom)
    def - (that: Rational): Rational =
        new Rational(
            numer * that.denom - that.numer * denom,
            denom * that.denom
        )
    def - (i: Int): Rational = 
        new Rational(numer - i, denom)
    def * (that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)
    def * (i: Int): Rational = 
        new Rational(numer * i, denom)
    def / (that: Rational): Rational =
        new Rational(
            numer * that.denom,
            denom * that.numer
        )
    def / (i: Int): Rational = 
        new Rational(numer, denom * i)
}

val r1 = new Rational(6, 4)
println("R1: " + r1)
println("R1 + 2 : " + (r1 + 2))
println("R1 - 2 : " + (r1 - 2)) 
println("R1 * 2 : " + (r1 * 2))
println("R1 / 2 : " + (r1 / 2))
