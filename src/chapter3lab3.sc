import scala.collection.mutable.ArrayBuffer

val words = ArrayBuffer("Mary", "had", "a", "little", "lamb", "hi","my")
words.groupBy(_.substring(0,1))
words.groupBy(_.length)
