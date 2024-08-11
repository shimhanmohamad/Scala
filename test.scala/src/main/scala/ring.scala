object ring extends App{
   
    def wholesale(c:Double):Double = {
        if(c <= 50){
            (24.95 * 0.6+3)*c;
        }
        else{
            (24.95 * 0.6 + 3)*c + (24.95 * 0.6 + 3 + 0.75)*(c-50);
        }
    }
      val total = wholesale(10);
      print(total);
}