// Immuutable Sets
// Invoke object scala.collection.immutable.Set
var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear" // Add new element
// Is just a shortcut for:
// jetSet = jetSet + "Lear"
// This will reassign the var jetSet!!
println(jetSet.contains("Lear"))
println(jetSet.contains("Ciccio"))

println("\n*****\n")

// Mutable Sets
import scala.collection.mutable
val nameSet = mutable.Set("Alex", "Pippo")
nameSet += "Ciccio"
// Is just adding to the previous Set since it's mutable!
// Shortcut for:
// nameSet.+=("Ciccio")
println(nameSet)


