val fruits: List[String] = List("orange", "banana", "melon")

// Map
println(fruits map (_ + "!!") )                     // List(orange!!, banana!!, melon!!)
println(fruits map (_.toList.reverse.mkString))     // List(egnaro, ananab, nolem)

// FlatMap
println(List.range(1,5) flatMap(
    i => List.range(1, i) map (j => (i, j))         // List((2,1), (3,1), (3,2), (4,1), (4,2), (4,3))
))

// ForEach
//fruits foreach (println(_ + "!!"))
fruits foreach(asd => println(asd))