object Importexample {
    import myfirstpackage.MyClass
    // import myfirstpackage._ // this is importing all!
    def main(args: Array[String]) = {
        val myC = new MyClass
        println(myC.hello)
    }
}


