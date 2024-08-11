object collatz {
  def collection(a: Int):Unit = {
    var k:Int = a
    while (k > 1) {
        if (k % 2 == 0) {
            k = k/2
            print(k+" ")
        }
        else {
            k =  (3*k) + 1
            print(k+ " ")
        }
    }
  }
}

object q1 extends App {
  print("Enter a Number : ")
  var num = scala.io.StdIn.readInt()
  var result = collatz.collection(num)
}
