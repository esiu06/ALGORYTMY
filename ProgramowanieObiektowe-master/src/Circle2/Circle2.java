package Circle2;

public class Circle2 {
    private double _radius = 1.0;

    public Circle2(){}

    public Circle2(double r){
        _radius = r;

    }

    public double getRadius() {

        return _radius;
    }
    public void setRadius(double radius){
        _radius = radius;

    }
    public double getArea(){

        return Math.PI * Math.pow(_radius, 2.0);
    }
    public double getCircumference() {
        return Math.PI * Math.pow(_radius, 2.0);
    }
    public String toString (){
        return "Circle[radius=2";
    }
}
