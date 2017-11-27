// Precondition
// If if you have requirements like d !=0 you can use
// precondition to perform a input validation of the class parameters

class Rational(n: Int, d: Int){
    require(d != 0)

    // Override the toString method
    override def toString = n + "/" + d
                                            
}

// This is ok!
val r = new Rational(3,4)
println(r)

// This will raise a 
// IllegalArumentException
// java.lang.IllegalArgumentException: requirement failed
// val illegal_r = new Rational(3,0)
//println(illegal_r)

