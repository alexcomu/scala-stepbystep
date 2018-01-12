def makeSeq(row: Int, columns: Int) = {
    for(col <- 1 to columns) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
    }
}

def makeMultiTable(columns: Int): String = {
    val table = for(row <- 1 to columns) yield makeSeq(row, columns).mkString
    table.mkString("\n")
}

println(makeMultiTable(10))
