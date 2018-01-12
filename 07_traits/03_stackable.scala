abstract class IntQueue {
    def get(): Int
    def put(x: Int)
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) = { buf += x}
}

// The trait can only be mixed into a class that also extends IntQueue
trait Doubling extends IntQueue{
    // stackable modifications!! 
    // If you need to mark this method as
    // abstract override
    abstract override def put(x: Int) = { super.put(2*x) }
    
}

trait Incrementing extends IntQueue {
    abstract override def put(x: Int) = { super.put(x+1) }
}

trait Filtering extends IntQueue {
    abstract override def put(x: Int) = { 
        if( x >= 0) super.put(x)
    }
}

// Mixed class! BasicInt with Doubling feature!!
class MyQueue extends BasicIntQueue with Doubling 

val queue = new MyQueue
queue.put(10)
println(queue.get()) // 20!

val q = new BasicIntQueue with Doubling 
q.put(10)
println(q.get()) // 20!

// Order is important!! Filtering and then incrementing
val myQueue = (new BasicIntQueue with Incrementing with Filtering)
myQueue.put(-1); myQueue.put(0); myQueue.put(1);
// -1 is filtered!
println(myQueue.get())
println(myQueue.get())

// Order is important!! Incrementing and then filtering
val myQueue2 = (new BasicIntQueue with Filtering with Incrementing)
myQueue2.put(-1); myQueue2.put(0); myQueue2.put(1);   
println(myQueue2.get())
println(myQueue2.get())
println(myQueue2.get())


