package MyPointMyCircle;

public class MyCircle {
    private MyPoint _center;
    private int _radius = 1;

    public MyCircle(){
    }
    public MyCircle(int x, int y, int radius){

    }
    public MyCircle(MyPoint center, int radius){
        _center = center;
        _radius = radius;
    }

    public int getRadius() {
        return _radius;
    }
}
