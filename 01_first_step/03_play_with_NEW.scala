// Just a collection of code examples with the NEW keyword.

val big = new java.math.BigInteger("12345")
println(big)

println("\n*****\n")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for(i <- 0 to greetStrings.length-1)
    print(greetStrings(i))

println("\n*****\n")



