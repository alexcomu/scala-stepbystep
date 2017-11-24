// Immutable MAP
val romanNumeral = Map(1->"I", 2->"II", 3->"III")
println(romanNumeral)
println(romanNumeral(1))

println("\n***\n")

// Mutable MAP
import scala.collection.mutable
val englishItalian = mutable.Map("one"->"uno")
englishItalian += ("two"->"due")
englishItalian += ("three"->"tre")
println(englishItalian)
println(englishItalian("two"))

println("\n***\n")

// Empty Mutable Map
val intEnglish = mutable.Map[Int, String]()
intEnglish += (1 -> "one")
intEnglish += (2 -> "two")
intEnglish += (3 -> "three")
println(intEnglish)
