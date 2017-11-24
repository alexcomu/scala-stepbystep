// This file simply show how to read lines from file
// Run this file:
// scala 10_read_file.scala 10_read_file.scala

import scala.io.Source

// Read from input the file to read
if (args.length > 0){
    // For each line print length and content
    val fp = Source.fromFile(args(0))
    for(line <- fp.getLines())
        println(line.length + " " + line)
}else
    Console.err.println("Please enter a filename")

