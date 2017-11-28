# Partially Applied Functions

Use _ to be shorter and more concise:

    scala> def sum(a: Int, b: Int, c: Int) = a+b+c
    sum: (a: Int, b: Int, c: Int)Int

    scala> val b = sum _
    b: (Int, Int, Int) => Int = $$Lambda$1105/623820846@11e9ac24

    scala> b(1,2,3)
    res0: Int = 6

    scala> val a = sum(1, _:Int, 2)
    a: Int => Int = $$Lambda$1109/2019181911@2bf3ec4

    scala> a(3)
    res1: Int = 6

    scala> val myList = List(1,2,3)
    myList: List[Int] = List(1, 2, 3)

    scala> myList.filter(_ == 2)
    res0: List[Int] = List(2)

    scala> myList.foreach(println _)
    1
    2
    3

    scala> myList.foreach(println)
    1
    2
    3
