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
}