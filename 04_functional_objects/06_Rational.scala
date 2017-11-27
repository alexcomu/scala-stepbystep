// Private Fields, methods and initializers!
// If the input is something like:
// 6/4
// I want to normalize the fraction, so I need to calculate the
// greater common denominator (gcd)
// I use a private variable g that is called INITIALIZER
// to initialize numer and denom

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

val r1 = new Rational(66, 42)
println(r1)
