object mark{
    def passfail(marks:Int):String={
        marks >= 50 match{
            case true => "PASS"
            case false => "FAIL"
        }
    }
}

object passfail extends App{
    var result = mark.passfail(54)
    println("Your marks status : " + result)
}