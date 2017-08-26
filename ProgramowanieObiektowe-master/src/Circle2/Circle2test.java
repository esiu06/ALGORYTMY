package Circle2;

import org.junit.Assert;
import org.junit.Test;

public class Circle2test {

    @Test
    public void circleTest(){
        Circle2 circle2 = new Circle2();
        Assert.assertEquals(1.0, circle2.getRadius(), 0.01);
    }
    @Test
    public void cirkleAreaTest(){
        Circle2 circle2 = new Circle2();
        Assert.assertEquals(Math.PI, circle2.getArea(),0.01);

    }
    @Test
    public void circleRadiusTest(){
        Circle2 circle2 = new Circle2();
        Assert.assertEquals(1.0, circle2.getRadius(),0.01);
    }
    @Test
    public void circleToStringTest(){
        Circle2 circle2 = new Circle2();
        Assert.assertEquals("Circle[radius=2", circle2.toString());
    }
}
