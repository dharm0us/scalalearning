//swap
val t = (1,2)
def swap(p: (Int,Int)):(Int,Int) = {
 //(p._2,p._1)
  t match {
    case (one,two) => (two,one)
  }
}
swap(t)

//swap first two elements of the array
def swap2(a: Array[Int]) = a match {
  case Array(x,y,rest @ _*) => Array(y,x) ++ rest
  case _ => a
}
swap2(Array(3,4,5,6)).foreach(println)
swap2(Array(3)).foreach(println)

abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item
val book = Article("book",10.5)
val bottle = Article("bottle",20.5)
val watch = Article("watch",30.5)
val gift = Bundle("bundle",10,book,bottle,watch)

def price(item: Item):(Double) = item match {
  case Article(_,p) => p
  case Bundle(_,dc,items @ _*) => items.map(price).reduceLeft(_ + _) - dc
}
price(book)
price(gift)
val Bundle(_,_,Article(p1,d1),_*) = gift
p1
d1

//Option Type
abstract class DoubleOption
case class SomeDouble(value: Double) extends DoubleOption
case object NoDouble extends DoubleOption

//case classes implement toString on there own

def inv(x: Double) = if(x == 0) NoDouble else SomeDouble(1/x)
inv(5)
inv(0)

//function composition


import scala.math._
def f(x: Double) = if(x <= 1) SomeDouble(sqrt(1-x)) else NoDouble

def compose(f: Double => DoubleOption,g: Double => DoubleOption) =
  (x: Double) => g(x) match {
    case SomeDouble(result) => f(result)
    case NoDouble => NoDouble
  }

val f1 = compose(inv,f)
f1(.75)
val f2 = compose(f,inv)
f2(1)
f1(0)
f2(0)


