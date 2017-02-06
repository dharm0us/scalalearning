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