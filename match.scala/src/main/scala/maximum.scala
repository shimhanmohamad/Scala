object max{
    def maxi(a:Int,b:Int):Int = {
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}

object ma{
    def m(a:Int,b:Int):Int ={
        a >= b match{
            case true => a
            case false => b
        }
    }
}

object maximum extends App{
    val result = max.maxi(2,5)
    println("Maximum Number between two integers : " + result)
    val re = ma.m(10,4)
    println("Maximum Number between two integers : " + re)
}

