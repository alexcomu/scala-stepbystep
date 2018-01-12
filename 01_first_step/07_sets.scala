// Immuutable Sets, only unique values
// Set is a trait.
// You can create an instance of a Set by invoking apply method of its companion object,
// which returns an instance of a default, immutable Set
// Invoke object scala.collection.immutable.Set
var jetSet = Set("Boeing", "Airbus", "Airbus")
jetSet += "Lear" // Add new element
println(jetSet)
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


