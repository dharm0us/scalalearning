class Point(val x: Double, val y: Double) {
  def move(dx: Double, dy: Double) = new Point(x+dx, y+dy)
  def distanceFromOrigin = math.sqrt(x*x + y*y)

  override def toString: String = f"(${x}, ${y})"
}

val p = new Point(3, 4)
p.distanceFromOrigin
p.move(4,5)
p
p.x