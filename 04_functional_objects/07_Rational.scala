// Defining operators

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
    def +(that: Rational): Rational = 
        new Rational(
            numer * that.denom + that.numer * denom,
            denom * that.denom
        )
    def *(that: Rational): Rational =
        new Rational(numer * that.numer, denom * that.denom)
}

val r1 = new Rational(6, 4)
println(r1)
val r2 = new Rational(10, 5)
println(r2)
println(r1 + r2) // r1.+(r2)
println(r1 * r2) // r1.*(r2)
