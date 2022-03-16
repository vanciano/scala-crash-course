class Rational(x: Int, y: Int):
  def numer = x
  def denom = y

  def neg: Rational = Rational(-numer, denom)

  def sub(x: Rational): Rational =
    Rational(numer * x.denom - x.numer * denom, denom * x.denom)

  override def toString: String = s"$numer/$denom"





def x = Rational(1, 3)
def y = Rational(5, 7)
def z = Rational(3, 2)

val value = x.sub(y).sub(z)
println(value)



