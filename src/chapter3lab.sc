import java.util.Scanner

import scala.collection.mutable.ArrayBuffer

//remove all but first neg number from the ArrayBuffer
val buf = ArrayBuffer(1, -2, 3, 4, -2, 9, -15 ,6 , 15, -9)

val indices = for(i <- 0 until buf.length if(buf(i) < 0)) yield i
val indicesr = indices.drop(1).reverse
for(e <- indicesr) buf.remove(e)
buf


val in = new Scanner(new java.net.URL(
  "https://raw.githubusercontent.com/ismaild/java4py/master/src/alice30.txt"
).openStream)
//val count = scala.collection.mutable.Map[String, Int]()
var count = scala.collection.immutable.Map[String, Int]()
while(in.hasNext) {
  val word = in.next();
  count = count + (word -> (count.getOrElse(word,0) + 1))
}
count("Alice")
