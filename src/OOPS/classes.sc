class Point(val x: Double = 0, val y: Double = 0) { //primary constructor
println(f" welcome to (${x}, ${y})")
  //def this() {this(0,0)} //aux constructor
  def move(dx: Double, dy: Double) = new Point(x+dx, y+dy)
  def distanceFromOrigin = math.sqrt(x*x + y*y)

  override def toString: String = f"(${x}, ${y})"
}

val p = new Point(3, 4)
val p1 = new Point()
p.distanceFromOrigin
p.move(4,5)
p
p.x
//error, x is val//p.x = 13

class Account  {
  private var balance = 0
}