// Repeted parameters
println("*** Repeted Arguments ***")
def echo(args: String*) = 
    for(arg<-args) println(arg)

echo("Hello")
echo("Hello", "World")

val myArray = Array("Hey", "dude", "What's up?")
echo(myArray: _*)

// Named arguments
println("\n*** Named Arguments ***")
def hello(name: String, lastname: String) = 
    println(name + " " + lastname)

hello("Alex", "Comu")
hello(name="Alex", lastname="Comu")
hello(lastname="Comu", name="Alex")


// Default Parameters
println("\n*** Default parameters ***")
def hello2(name: String = "Unknown", lastname: String = "Unknown") = 
    println(name + " " + lastname)

hello2("Alex")
hello2(name="Alex")
hello2(lastname="Comu")


