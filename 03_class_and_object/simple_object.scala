// Singleton Objects, it's like a static member

object MyObject {
    def say_hello(): String = { "Hello!"}
}

println(MyObject.say_hello())
