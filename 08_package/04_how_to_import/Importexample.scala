object Importexample {
    import myfirstpackage.MyClass
    // import myfirstpackage._ // this is importing all!
    import myfirstpackage.Ciccio.{name, nickname => nickname_alias}

    def main(args: Array[String]) = {
        val myC = new MyClass
        println(myC.hello)
        println(name + " --> " + nickname_alias)
    }
}


