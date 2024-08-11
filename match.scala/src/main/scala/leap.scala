object le{
    def isleapyear(y:Int):Boolean = {
        if(y % 4 == 0 && y % 100 != 0){
            println(y + " is leapyear")
              return true
        }
        else if(y % 400 == 0){
            println(y+ " is leapyear")
            return true
        }
        else{
            println(y + " is not a leap year")
            return false
        }
    }
}

object leap extends App{
    le.isleapyear(2010)
}