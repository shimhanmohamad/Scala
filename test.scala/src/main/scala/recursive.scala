
object g {
  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case _ if b > a => gcd(b, a)
    case _ => gcd(b, a % b)
  }
}

object recursive extends App{
    var result = g.gcd(24,12)
    println(result)
}