object PrimeCheck extends App {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
  }

  // Example usage
  println(isPrime(15))  // Output: false
  println(isPrime(17))  // Output: true
}
