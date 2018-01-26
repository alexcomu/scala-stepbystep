val fruits: List[String] = List("orange", "banana", "melon")

println("Head: " + fruits.head)
println("Tail: " + fruits.tail)
println("IsEmpty? " + fruits.isEmpty)
println("Head isEmpty? " + fruits.head.isEmpty)

// Error: head of empty list
// println("Empty List Head: " + Nil.head) 
// Error: value isEmpty is not a member of Nothing
// println("Empty list Head isEmpty? " + Nil.head.isEmpty) // Error! 


// Example of Insertion sort

def isort(xs: List[Int]): List[Int] = 
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

def insert(x: Int, xs: List[Int]): List[Int] = 
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

val random_list = List(2,1,6,8,9,0,4)
println(isort(random_list))

// List pattern
val List (a,b,c) = fruits
println(a,b,c)
val num1 :: num2 :: others = random_list
println(num1, num2, random_list)


// First-order methods - a method is first-order if it does not take any functions as arguments.

println("\n### Concatentating two Lists")
val longList: List[Int] = List(0, 1,2) ::: List(3,4) ::: List(5,6) 
println( List(0,1,2) ::: List(3,4) ::: List(5,6)  )
println(longList + " with length: " + longList.length)

println("Init:" + longList.init + ", last:" + longList.last)
println("Reverse: " + longList.reverse)
println("Drop 2: " + longList.drop(2))
println("take 2: " + longList.take(2))
println("Split at 2: " + longList.splitAt(2)) // Split at second emelent -> Return 2 lists

println("Flattening List of List: " + List(List(1,2), List(3,4)).flatten )
println("Flattening List of List: " + fruits.map(_.toCharArray).flatten )

val zipped = longList zip List('a', 'b', 'c')
println("Zip two lists: " +  zipped)
println("Unzip: " + zipped.unzip)

println("To String: " + fruits.toString)
println("Make String: " + fruits.mkString(", "))
println("Make String: " + fruits.mkString("--> ",", "," <--"))
// Using String Builder...
val buf = new StringBuilder
fruits addString (buf, "--> ",", "," <--")
println(buf)

// Iterator
val myIt = fruits.iterator
println(myIt.next)
println(myIt.next)

// toArray & copyToArray
val arr = fruits.toArray
println(arr)
println(arr.toList)