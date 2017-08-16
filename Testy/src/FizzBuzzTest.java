import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz testObjekt = new FizzBuzz();
    @Test
    public void shouldReturnEmty() {
        Assert.assertArrayEquals(new String[0], testObjekt.fizzBuzz(0));
    }
    @Test
    public void shouldReturnEmty1() {
        Assert.assertArrayEquals(new String[]{"1"}, testObjekt.fizzBuzz(1));
    }
    @Test
    public void shouldReturnEmty2() {
        Assert.assertArrayEquals(new String[]{"1", "2"}, testObjekt.fizzBuzz(2));
    }
    @Test
    public void shouldReturnEmtyFizz() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz"}, testObjekt.fizzBuzz(3));
    }
    @Test
    public void shouldReturnEmtyFizz2() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz"}, testObjekt.fizzBuzz(6));
    }
    @Test
    public void shouldReturnEmtyBuzz() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz"}, testObjekt.fizzBuzz(6));
    }
    @Test
    public void shouldReturnEmtyBuuz10() {
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, testObjekt.fizzBuzz(10));
    }
    @Test
    public void shouldReturnEmtyBuuz15() {
        Assert.assertEquals("FizzBuzz", testObjekt.getStringRepresentation(15));
    }
    @Test
    public void shouldReturnEmtyBuuz105() {
        Assert.assertEquals("FizzBuzz", testObjekt.getStringRepresentation(105));
    }
}

