// Lists are similar to Array but with 2 differents:
// Are immutables
// Have recursive structure (i.e. a Linked List)

// List are homogeneous -> the elements all have the same type.

val fruit: List[String] = List("banana", "orange")
val numbers: List[Int] = List(1,2,3)
val list_of_list: List[List[Int]] = List(

    List(1,2),
    List(3,4)
    )
val emptyList: List[Nothing] = List()

var fruit_again = "banana" :: "orange" :: "orange" :: Nil
var fruit_of_colors = "banana" :: ("orange" :: ("random" :: Nil) ) 

println(fruit_again)
println(fruit_of_colors)
