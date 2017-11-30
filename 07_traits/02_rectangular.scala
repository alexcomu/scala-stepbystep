class Point(val x: Int, val y: Int)

// Rich Interface!
trait Rectangular {
    def topLeft: Point
    def bottomRight: Point

    def left = topLeft.x
    def right = bottomRight.x
    def width = right - left
    // other methods..
}

abstract class Component extends Rectangular {
    // Other methods..
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular{
    // other methods..
}


val r = new Rectangle(new Point(1,1), new Point(10,10))
println(r.left)
println(r.right)
println(r.width)
