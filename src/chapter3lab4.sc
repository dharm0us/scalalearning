import scala.collection.mutable.ArrayBuffer

"New York".partition(_.isUpper)
"New York".partition(_.isLower)

val buf = ArrayBuffer(1, -2, 3, 4, -2, 9, -15 ,6 , 15, -9)
val (neg,pos) = buf.partition(_ < 0)
var result = pos
result += neg(0)

val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)
pairs.mkString("-")
for((s,n) <- pairs) print(s*n)
