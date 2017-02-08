val ch = '+';
var digit = 0
val i = 8
val sign = ch match {
  case '+' =>  1
  case '-' =>  1
  case ch if(Character.isDigit(ch)) => digit = Character.digit(ch, 10)
  case _ => 0
}

//type match as opposed to instance of
//constants match, should start from UpperCase
//for lowercase constants use backticks
//similar type matching in try Catch

//matching with pairs, tuples, Arrays too
//it's called extraction, similar to deconstructing in React

//case classes
//Option[T] is of type T or null

//Evaluate expressions
//Recursive Data structures
/*abstract class Expr
case class Num(value: Int) extends Expr
case class Sum(left: Expr, right: Expr) extends Expr
case class Product(left: Expr, right: Expr) extends Expr

val e = Product(Num(3), Sum(Num(4), Num(5)))
def eval(e: Expr):Int = e match {
  case Num(v) => v
  case Sum(l,r) => eval(l) + eval(r)
  case Product(l,r) => eval(l) * eval(r)
}
eval(e)
*/

abstract class Expr {
  def eval: Int
}

class Num(val data: Int) extends Expr {
  def eval: Int = data
}
class Product(val left: Expr, val right: Expr) extends Expr {
  def eval: Int = left.eval * right.eval
}
class Sum(val left: Expr, val right: Expr) extends Expr {
 def eval: Int = left.eval + right.eval
}

val e = new Product(new Num(3), new Sum(new Num(4), new Num(5)))
e.eval


