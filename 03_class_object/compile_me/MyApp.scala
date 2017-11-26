import Counter.plus_one
import Counter.get_counter

object MyApp {
    def main(args: Array[String]) = {
        //var counter = new Counter
        for (arg <- args)
            for (letter <- arg)
                plus_one()
        println("Letter: " + get_counter())
    }
}

