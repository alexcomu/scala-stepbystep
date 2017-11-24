// Characters Literals

val a = 'A'
val d = '\u0041' // Unicode code point
val backslash = '\\'

// String Literals

val hello = "Hello"
var raw_string = """Hello
                    How are you?"""
println(raw_string)
raw_string = """|Hello
                |How are you?""".stripMargin
println(raw_string)

val name = "Alex"
println(s"Hello $name!")
println(s"2*2 = ${2*2}")
println(f"PI: ${math.Pi}%.5f")
println(raw"Printing without escaping\\\\\\\!!")
// Boolean literals
val istrue = true
val isfalse = !istrue // false
println(istrue, isfalse)
