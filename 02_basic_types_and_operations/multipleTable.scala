def makeSeq(row: Int, columns: Int) = {
    for(col <- 1 to columns) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
    }
}

def makeRow(row: Int, columns: Int): String = makeSeq(row, columns).mkString

def makeMultiTable(columns: Int): String = {
    val table = for(row <- 1 to columns) yield makeRow(row, columns)
    table.mkString("\n")
}

//println(makeSeq(1,10))
//println(makeRow(2,10))
println(makeMultiTable(10))
