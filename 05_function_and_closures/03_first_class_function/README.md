# First Class function

We can write down functionas as unnamed *literals* and the pass them around as *value*.

Here an example:

    scala> (x: Int) => x + 1
    res0: Int => Int = $$Lambda$1076/1792110618@7ecda95b

    scala> var increase = (x: Int) => x + 1
    increase: Int => Int = $$Lambda$1089/1836765429@30abf79c

    scala> increase(10)
    res2: Int = 11

    scala> increase = (x: Int) => x + 999
    increase: Int => Int = $$Lambda$1125/1022680775@1b94c789

    scala> increase(1)
    res3: Int = 1000

    scala> var hello = (name: String) => {
        | print("Hello ")
        | print(name)
        | print("!")
        | }
    hello: String => Unit = $$Lambda$1233/260275217@1aca6dc3

    scala> hello("Alex")
    Hello Alex!

