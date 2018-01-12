// For immutable sequence of objects we can use List

val myList = List(1,2,3)
val otherList = List(4,5,6)

// List concatenation
val mixedList = myList ::: otherList
println(mixedList)

println(myList +" and "+ otherList +" were not mutated.")
println("Thus, "+ mixedList +" is a new list.")

println("\n*****\n")

// Most common operator '::' (cons) to concatenate at the beginning of a list
// '::' expect on the right a list!
println(0 :: myList)
println(myList :: myList) // --> [ [1,2,3] , 1,2,3]

println("\n*****\n")

// Nil is not included, used to stop the list
val oneTwoThree = 1 :: 2 :: 3 :: Nil
println(oneTwoThree)

val emptyList = Nil
println(emptyList)
println("\n*****\n")

// Mixed List
val ciccio = List(1, "asd", Nil, true, List())
println(ciccio)

println("\n\n### Lists, most useful methods!\n")

var comuList = List("Hello", "Friend", "I'm Alex")

// Count Method
println("# COUNT")
println("Words with lenght 4: " + comuList.count(s=>s.length==5))

println("\n***\n")

// Exists Method
// Return True if the element is inside the List
println("# EXISTS")
println(comuList.exists(s=> s=="Hello"))

println("\n***\n")

// Filter Method
println("# Filter")
println(comuList.filter(s=> s.length>5))

println("\n***\n")

// Drop & DropRight
// DROP: Return the list without the first N elements
// DROPRIRIGHT: Return the list without the first N rights elements
// The original list is not modified!!
println("# DROP")
println(comuList.drop(2))
println(comuList.dropRight(2))

println("\n***\n")

// forall Method
// Apply operation on each element, return true or false
println("# FORALL")
println("ComuList elements ends all with letter o?? --> " + comuList.forall(s=> s.endsWith("o"))) 
println("(Hello) list elements ends with letter o?? --> " + List("Hello", "ciccio").forall(s=> s.endsWith("o")))

println("\n***\n")

// FOREACH
comuList.foreach(s=>print(s))
println()
comuList.foreach(print)

println("\n***\n")

println("Other methods:")
println("HEAD: " + comuList.head)
println("TAIL: " + comuList.tail)
println("INIT: " + comuList.init)
println("LAST: " + comuList.last)
println("LENGTH: " + comuList.length)
println("MAP: " + comuList.map(s => s+"!!"))
println("MKSTRING: " + comuList.mkString(", "))
println("REVERSE: " + comuList.reverse)







