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

def While(cond:() => Boolean, exec: () => Unit) {
  if(cond()) {
    exec()
    While(cond,exec)
  }
}

//call by name
def Whilen(cond: => Boolean, exec:  => Unit) {
  if(cond) {
    exec
    Whilen(cond,exec)
  }
}

//currying

def Whilec(cond: => Boolean) (exec:  => Unit) {
  if(cond) {
    exec
    Whilec(cond)(exec)
  }
}
val n = 6
var i = 1
var f = 1

val cond = () => {i<n}
val exec = () => {f *= i; i += 1}

//While(cond,exec)
//Whilen(i<n, {f *= i; i += 1})
Whilec(i<n) { f *= i; i += 1;}
f
//def strcat(s1: String) = (s2: String) => s1 + s2
/*def While1 (cond:() => Boolean):Any =  (exec: () => Unit) =>  {
  if(cond()) {
    exec()
    While1(cond)(exec)
  }
}*/
