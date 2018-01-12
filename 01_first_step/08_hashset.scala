// Immutable HashSet
// HashSet is a concrete implementation of a Set.

import scala.collection.immutable.HashSet
val myHashSet = HashSet("Hello", "Friend")
println(myHashSet + "Enjoy!")
println(myHashSet)

// Mutable HashSet
import scala.collection.mutable
var myMutableHashSet = mutable.HashSet("Hello", "Friend")
myMutableHashSet.+=("Enjoy!")
println(myMutableHashSet)
