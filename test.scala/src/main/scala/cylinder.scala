object cylinder extends App{
    def disk(r:Double):Double = r * r * math.Pi;
    def rectangle(r:Double,h:Double):Double = 2 * math.Pi * r * h;

    var  disksarea = 2 * disk(7);
    var rectanglarea = rectangle(7,10);
    var total = disksarea + rectanglarea;

    print(total);
}


