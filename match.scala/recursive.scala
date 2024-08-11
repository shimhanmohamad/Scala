object recursive extends App{
    def blast(n:Int):Unit = {
        println(n)
        if(n<=1) println("Blast Off!")
        else blast((n-1))
    }
    blast(3)
}