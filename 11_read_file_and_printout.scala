// Like example 10, I'm just printing out a better format

import scala.io.Source
if (args.length == 0){
    Console.err.println("Please give me some file to read!")
    System.exit(1)
}

// return length of the length: 
// line with length 10 --> 2
// line with length  5 --> 1
def widthOfLength(s: String) = s.length.toString.length

// file pointer
val fp = Source.fromFile(args(0))
// get list of lines
val lines = fp.getLines().toList
// get longest line 
val longestLine = lines.reduceLeft(
    (a,b) => if(a.length > b.length) a else b
)
// Get max width of the longest line
val maxWidth = widthOfLength(longestLine)

// For each line
for (line <- lines) {
    // Evalueate how many spaces
    val numSpaces = maxWidth - widthOfLength(line)
    // Create emptySpace * numSpaces
    val padding = " " * numSpaces
    // We are finally ready to print out the formatted string!
    println(padding + line.length + " | " + line)
}
