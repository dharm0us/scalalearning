import scala.math._
val fun = ceil _
fun(Pi)
ceil(Pi)
Array(3.14,1.42,3.5).map(fun)
Array(3.14,1.42,3.5).map((x:Double) => 3*x)
val triple = (x:Double) => 3*x
//Only give a function a name if it's used multiple times or in documentation
//can use val or def for defining function. for recursive need def

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil)

def mulBy(factor: Double) = (x: Double) => factor*x//sort of a function factory
val quintuple = mulBy(5)
quintuple(3)

//all these are same
valueAtOneQuarter(mulBy(3))
valueAtOneQuarter(3*_)
valueAtOneQuarter(x => 3*x)
valueAtOneQuarter((x) => 3*x)
valueAtOneQuarter((x: Double) => 3*x)
