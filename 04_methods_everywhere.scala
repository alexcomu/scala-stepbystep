// 1+2
// Internally what is going on is:
// (1).+(2)
// This means that I'm calling the method '+' of the object 1, which is of class type Int. I'm passing as argument the Integer 2.

println((1).+(2))

println("\n*****\n")

// We can apply the same approach with the previous array:

var myArray = new Array[String](3)
println("Position zero: " + myArray.apply(0))
myArray.update(0, "Hello!")
println("Position zero: " + myArray.apply(0))

println("\n*****\n")

for(i <- 0 to myArray.length -1){
    myArray.update(i, "Bla bla")
}
myArray.foreach(element=>println(element))

println("\n*****\n")

// Same approach when creating a new Array
var asd = Array("Hello", "World")
println(asd(0))
asd = Array.apply("Hello", "World")
println(asd(0))



