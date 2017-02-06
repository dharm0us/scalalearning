def abs(x: Double) = if (x >= 0) x else -x//return type is inferred
abs(-6)

//return type has to be specified for recursive functions
def fac(n: Int): Int = if (n == 1) 1 else n*fac(n-1)

//If you omit = , function doesn't return anything
def box(s: String)  {
 val border = "-" * s.length + "--\n"
 println(border + "|" + s + "|\n" + border)
}
box("hello")

//default/named arguments
def decorate(str:String, left:String= "[", right:String= "]") = left + str + right

decorate("hey")
decorate("hey",">>>[")
decorate("hey", right = "]<<<")

//variable arguments
def sum(args: Int*) = { //args is Seq[Int]
  var result = 0
  for(arg <-args) {
   result += arg
  }
  result
}

sum(1,2,3,4)

//If you already have Seq[Int]
//this won't work
//sum(1 to 10)
//this would
sum(1 to 10 : _*)

//for recursive functions

def recursiveSum(args: Int*): Int = {
  if(args.length == 0) 0
  else args.head + recursiveSum(args.tail : _*)
}

recursiveSum(1,2,3,4,5,6,7)
