object sheet2 {
  "hello"(4) //internally apply method is declared
  "hello".apply(4)
  "hello".length //methods which don't mutate the object can be called without parenthesis
  var b:BigInt = 21
  b.pow(1000)

  import scala.math._ //imports can be anywhere, _ in place of *
  sqrt(16)
  1.to(10).map(sqrt(_))
  6.*(7)
  "totloni".distinct
  "Rhine".permutations.toArray.map(println(_))

  "ABC".sum.toInt
  "ABC".sum
  ('A' + 'B' + 'C')
  ('A' + 'B' + 'C').toInt
  'A'.toInt

  val x = -2
  val test = if(x > 0) "something" else -1
  /*
  If has a return type and value.
  Type is the common supertype of both the branches.
  Any is like Object of Java
   */

  val test1 = if(x>0) "hey"//() is like void of java but it has a value ()
  val result = ()

  //blocks are also expressions
  val distance = {
    val a = 7
    val b = 7
    a + b
  }

}