
object q1 extends App{
    var n:Array[Int] = new Array[Int](5)
    def readA(i:Int):Array[Int] = {
        if(i<1)Array()
        else{
            print("Enter  > ")
            Array(scala.io.StdIn.readInt())++readA(i-1)
        }
    }
    var arr:Array[Int] = new Array[Int](4)
    

    readA(5)
}