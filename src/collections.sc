import scala.collection.mutable.ArrayBuffer

val num = new Array[Int](10)
val a = Array("hi", "there")
a(0) = "bye"
println(a(0))
println(a(1))
for(element <- a) println(element)
for(i <- 0 until a.length) println(a(i))

//ArrayBuffer is like Java's ArrayList
val b = new ArrayBuffer[Int]
b += 1
b += (2,3,4)
b ++= Array(5,6,7)
b.insert(2,9,10)
b

val k = ArrayBuffer("Mary", "had", "a", "little", "lamb")
k.remove(1)
k.trimEnd(2)
k
k.toArray
k.toArray.toBuffer

//aggregate ops
Array(1,2,3).sum
Array("Mary", "had", "a").max
ArrayBuffer(11,1,2,3).sorted
ArrayBuffer(11,1,2,3).reverse
Array("Mary", "had", "a").mkString("-")

val scores = Map("Alice" -> 10, "Larry" -> 11)
val scoresM = scala.collection.mutable.Map("Alice" -> 10, "Larry" -> 11)
"Alice" -> 10
scores("Larry")
//scores("Karry")
scores.getOrElse("Karry",0)
scoresM += ("Manu" -> 51)
scoresM -= ("Manu")

//scala encourages immutable maps
val scores1 = Map("Alice" -> 10, "Larry" -> 11)
val newScores = scores1 + ("tanu" -> 34)

for((k,v) <- scores) println(k +" has score "+v)
for((k,v) <- scores) yield (v,k) //key, value reversed
//output of yield is same thing as the one you are iterating over, here it's Map

//tuple
val t = (1,3.14, "dharam")
val second = t._2
t _1

val (_, second1, third) = t
