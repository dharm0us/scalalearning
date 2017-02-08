import java.awt._
import java.io.{FileInputStream, InputStream}

val rec = new Rectangle(1,2)
rec.translate(10,20)
rec

val egg = new geom.Ellipse2D.Double(1,2,3,4)

trait RectangleLike {
  def setFrame(x:Double, y:Double, w:Double, h:Double): Unit
  def getX:Double
  def getY:Double
  def getWidth:Double
  def getHeight:Double
  def translate(dx:Double, dy:Double) {setFrame(getX + dx, getY + dy, getWidth,getHeight)}
}
val egg1 = new geom.Ellipse2D.Double(1,2,3,4) with RectangleLike
egg1.translate(9,10)
egg1.x
egg1.y

