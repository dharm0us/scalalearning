class Point(val x: Double = 0, val y: Double = 0) { //primary constructor
println(f" welcome to (${x}, ${y})")
  //def this() {this(0,0)} //aux constructor
  def move(dx: Double, dy: Double) = new Point(x+dx, y+dy)
  def *(fac: Double) = new Point(x*fac, y*fac)
  def distanceFromOrigin = math.sqrt(x*x + y*y)

  override def toString: String = f"(${x}, ${y})"
}

val p = new Point(3, 4)
val p1 = new Point()
p.distanceFromOrigin /*
1. how do you distinguish from an instance variable
2. It's called Uniform Access. User of the class is not bothered
3. No need to fear public instance variables like Java
*/
p.move(4,5)
p
p.x
//error, x is val//p.x = 13

class Account  {
  private var balance = 0
}

//interoperability of operator and method
new Point(3,4) * 2
new Point(3,4).*(2)

1 to 10 map(_*3) filter(_ % 5 == 2)
1.to(10).map(_*3).filter(_ % 5 == 2)

//map(key) is map.apply(key)
