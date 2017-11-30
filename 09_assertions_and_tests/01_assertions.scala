def sum_if_different(x: Int, y: Int): Int = {
    // If different is fine! 
    // If are equale --> Exception!
    assert(x != y)
    x + y
}

try{
    println("They are different and the sum is " + sum_if_different(0,1))
    println("They are different and the sum is " + sum_if_different(0,0))
} catch {
    case ex: AssertionError => println("Input Error!")
}

