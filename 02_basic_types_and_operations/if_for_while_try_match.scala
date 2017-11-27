// Just a simple playground
// With example of the basics Built-in operators

/* IF  */
println("*** IF ***")
println(if (true) "Hello" else "can't see me.")

/* DO WHILE */
println("\n*** WHILE DO ***")
def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while( a != 0){
        val temp = a
        a = b % a
        b = temp
    }
    b
}
println(gcdLoop(106786178, 5123316))


/* WHILE DO  */
println("\n*** DO WHILE ***")
val hello = "HelloFriend."
var c = 0
do {
    println(hello(c))
    c += 1
}while(c < hello.length)


/* FOR on iterable collection */
println("\n*** FOR ***")
for (letter <- hello)
    println(letter)
var myList = List("Hello", "Friend")
for (el <- myList)
    println(el)
/* FOR on range */
for(i <- 1 to 4) // 4 is included
    println("-> " + i)
for(i <- 1 until 4) // 4 is not included
    println("## " + i)

/* FILTERING */
var myList2 = List(1,2,3,4,5,6,7,8,9)
println("Even numbers multiples of 3: ")
for(num <- myList2 if (num%2==0) if (num%3==0))
    println(num)
// Put the results in a collection!
val myListOfResults = for(num <- myList2 if (num%2==0)) yield(num)
println(myListOfResults)


/* EXCEPTION */
println("\n*** EXCEPTION **")
val n = 3
/*
if (n%2==0)
    println("YEAH")
else
    // This will stop the exection!
    throw new RuntimeException("n must be even!") 
*/
try{
    if (n%2==0) println("YEAH!")
    else        throw new RuntimeException("n must be even!")
} catch {
    case ex: RuntimeException => println(ex)
    case ex: Exception => println("Generic Exception: " + ex)
} finally {
    println("Always executed!")
}


def returnValue(i: Int): Int = {
    try{
        if (i%2!=0) 
            throw new RuntimeException("Need Even number!")
        i
    }
    catch {
        case ex: RuntimeException => 0
    }
}

println(returnValue(10))
println(returnValue(1))


/* MATCH */
println("\n*** MATCH **")
var myList3 = List("hello", "friend", "YES", "Good", "job")
import scala.util.control.Breaks._
c = 0
breakable {
    while(true){
        if (myList3(c) == "YES"){
            println("YEAAAH!! " + c)
            break
        }
        c += 1
    }
}



