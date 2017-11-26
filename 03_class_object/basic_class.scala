// Simple Class in Scala

class MyClass{
    var hello = "Hello World!" // Public member
    private var private_c = 0  // Private member

    def c_plus_X(X: Int): Unit = {private_c += 1} // This is a procedure
    def get_c(): Int = private_c 
}

val mc = new MyClass
println(mc.hello)
println(mc.get_c())
mc.c_plus_X(10)
println(mc.get_c())
