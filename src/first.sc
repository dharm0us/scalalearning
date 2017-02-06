object sheet1 {
  /*
  1. auto type inference
  2. val(immutable) can't be modified, var can be
  3. no primitives, everything an object. unlike Java. Hence the type names Int,Double etc
  4. semicolons are optional
  5. Big numbers are usable.
  6. ++ and -- don't exist
   */
  val answer  = 8*5 + 2
  answer
  //answer = 43
  var response = 43
  response = 44
  //response = "hello"
  var greeting: String = null
  1.to(10)
  1 to 10
  "hello".intersect("world")
  val x: BigInt  = 123456789
  x * x * x *x
  var result = 1 + 10
  result = 1.+(10)//operators as methods
}