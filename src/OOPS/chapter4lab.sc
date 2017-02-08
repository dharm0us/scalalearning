class Time(var h: Int, val m: Int) {
  if(h<0 || h>23 || m<0 || m>59) throw new IllegalArgumentException
  override def toString: String = f"({$h}:{$m})"
  def before(other: Time) = {
    other.h = 9
    h < other.h ||  h == other.h && m < other.m
  }
}
val t1 = new Time(0,2)
val t2 = new Time(1,2)
t2.before(t1)
t1

class Time1(var h: Int, val m: Int) {
  private val minutesSinceMidnight = h*60 + m;
  if(h<0 || h>23 || m<0 || m>59) throw new IllegalArgumentException
  override def toString: String = f"({$h}:{$m})"
  def -(other: Time1) = { minutesSinceMidnight - other.minutesSinceMidnight}
  def <(other: Time1) = {
    other.h = 9
    h < other.h ||  h == other.h && m < other.m
  }
}
val t11 = new Time1(0,2)
val t12 = new Time1(3,3)
t11 < t11
t11 - t12

object Time1 {
  def apply(h:Int, m:Int) = new Time1(h,m)
}

Time1(4,5) - Time1(5,6)
