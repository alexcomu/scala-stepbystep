// For immutable sequence of objects we can use List

val myList = List(1,2,3)
val otherList = List(4,5,6)

// List concatenation
val mixedList = myList ::: otherList
println(mixedList)

println(myList +" and "+ otherList +" were not mutated.")
println("Thus, "+ mixedList +" is a new list.")

println("\n*****\n")

// Most common operator '::' to append
// '::' expect on the right a list!
println(0 :: myList)
println(myList :: myList) // --> [ [1,2,3] , 1,2,3]

println("\n*****\n")

val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)

println("\n*****\n")

// Mixed List
val ciccio = List(1, "asd", Nil, true, List())
println(ciccio)

