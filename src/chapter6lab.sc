val zones = java.util.TimeZone.getAvailableIDs().grouped(20)
zones.toArray.map(_(0)).map(_.split("/")).filter(_.length == 2).map(_(1)).map(println)

def fac(n: Int):BigInt = {1.to(n).reduceLeft(_ * _)}
def x_y(x: Int, y: Int):BigInt = {1.to(y).map(_ => x).reduceLeft(_ * _)}
//def x_y_1(x: Int, y: Int):BigInt = {1.to(y).map(_ => x).reduceLeft(_ * _)}
def concat(s: Seq[String], sep: String) = {s.reduceLeft(_+ " "+_)}
//fac(5)
x_y(2,4)
//def two_pow(n: Int) =
concat(Array("Mary","had","a")," ")
