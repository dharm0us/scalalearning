class Time(val h: Int, val m: Int) {
  if(h<0 || h>23 || m<0 || m>59) throw new IllegalArgumentException
  override def toString: String = f"({$h}:{$m})"
  def before(other: Time) = {
    (this.h < other.h) ||  (this.m < other.m)
  }
}
val t1 = new Time(0,2)
val t2 = new Time(1,2)
t2.before(t1)
