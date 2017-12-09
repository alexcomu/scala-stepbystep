val fruits: List[String] = List("orange", "banana", "melon")

// Map
println(fruits map (_ + "!!") )
println(fruits map (_.toList.reverse.mkString))

// FlatMap
println(List.range(1,5) flatMap(
    i => List.range(1, i) map (j => (i, j))
))

