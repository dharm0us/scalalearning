import java.io.{FileInputStream, InputStream}

trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String)= println(msg)
}

trait Buffered extends InputStream with Logged{
  val SIZE = 3
  private var end = 0
  private var pos = 0
  private val buffer = new Array[Byte](SIZE)

  override def read() = {
    if(pos == end) {
      log("buffer empty")
      end = super.read(buffer,0,SIZE)
      pos = 0
      //println("pos "+pos+" end "+end)
    }
    if(pos == end) {
      //println("ret -1 pos "+pos+" end "+end)
      -1
    } else {
      pos += 1
      //println("buffer pos -1")
      //println(buffer(pos-1))
      buffer(pos-1)
    }
  }
}


var s = new FileInputStream("C:\\eula.1028.txt") with Buffered with ConsoleLogger
s.read()
s.read()
s.read()
s.read()
s.read()
s.read()
s.read()
s.read()
s.read()
