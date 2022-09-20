object question extends App{
    var p = Point(2,5);
    var q = Point(3,4);

    println(p);
    println(q);

    println(p.add(q));

    p.move(2, 3);
    println(p);

    var r = p.distance(q)
    println(r);

    p.invert()
    println(p)
}
case class Point(var x:Int, var y:Int) { 
        def add(p:Point) = new Point(x+p.x, y+p.y)

        def move(n:Int, m:Int) ={
            this.x = this.x + n;
            this.y = this.y + m;
        } 
        def distance(a:Point) = {
            var distanceX = x - a.x;
            var distanceY = y - a.y;
            var dist = distanceX*distanceX + distanceY*distanceY; 
            scala.math.sqrt(dist)
        }
        def invert() = {
            var w = this.x;
            this.x = this.y;
            this.y = w;
        }
    }