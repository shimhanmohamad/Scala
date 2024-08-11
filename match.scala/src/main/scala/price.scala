object book{
  def WholesalePriceforLot(bookprice:Double,discount:Double,bookcount:Int):Double = {
    var final_price = 
    if(bookcount <= 50){
      bookprice * bookcount * discount + 3
    }
    else{
      (bookprice * discount * 50 + 3) + (bookprice * (bookcount-50) * discount * 0.75)
    }
    final_price
  }
}

object maximum extends App{
  var bookprice = 24.95
  var discount = 0.6
  var price = book.WholesalePriceforLot(bookprice,discount,60)
  println("Totol cost for 60 books : " + price)
}