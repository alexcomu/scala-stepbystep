// Print out for each params "Hello World PARAM"
// You can call it simply run 
//      scala hello_with_params.scala Alex Pippo Pluto


// First version
if(args.length>0)
    //args.foreach(arg=>println("Hello World " + arg + "!"))
    args.foreach((arg: String)=>println(s"Hello world $arg!"))
else
    println("Hello World NoName!")

println("\n***\n")

// Second version
for (arg <- args)
    println(s"Hello world $arg!")
