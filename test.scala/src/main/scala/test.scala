import scala.io.StdIn.readLine

object test extends App{
    def easy(t:Int):Int = t*8; 
    def tempo(t:Int):Int = t*7;
    var total = easy(2) + tempo(3) + easy(2);
    print(total); 
}