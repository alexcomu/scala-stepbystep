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


