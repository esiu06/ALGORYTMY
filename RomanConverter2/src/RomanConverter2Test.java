import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class RomanConverter2Test {
    private final String exectedOutput;
    private final int number;
    RomanConverter2 testObject = new RomanConverter2();
@Parameters(name = "{1} -> {0}")
public static Object[][] data() {
    return new Object[][]{
            {"I", 1},
            {"II",2},
            {"III",3},
            {"IV",4},
            {"V",5},
            {"VI",6},
            {"VII",7},
            {"VIII",8},
            {"IX",9},
            {"X",10},
            {"XIV",14},
            {"XV",15},
            {"XVII",17},
            {"XIX",19},
            {"XX",20},
            {"XXXIX",39},
            {"XL",40},
            {"XLI",41},
            {"L",50},
            {"LXXXIX",89},
            {"XC",90},
            {"C",100},
            {"CD",400},
            {"D",500},
            {"CM",900},
            {"M",1000},
            {"MMXVII",2017}

    };
    }
    public RomanConverter2Test(String expectedOutput, int number){
        this.exectedOutput = expectedOutput;
        this.number = number;
    }
    @Test
    public void assertConversion(){
        assertConversion(exectedOutput,number);
    }
    private void assertConversion(String expected, int number) {
        Assert.assertEquals(expected, testObject.convert(number));
    }

//    @Test
//    public void zwrocDuzaJedynke(){
//        assertConversion("I",1);
//    }
//    @Test
//    public void zwrocDuzaDwujke(){
//        assertConversion("II",2);
//    }
//    @Test
//    public void zwrocDuzaTrojke() {
//        assertConversion("III",3);
//    }
//    @Test
//    public void zwrocDuzaCzworke() {
//
//        assertConversion("IV", 4);
//    }
//    @Test
//    public void zwrocDuzaPiatke() {
//        assertConversion("V", 5);
//    }
//    @Test
//    public void zwrocDuzaSzustke() {
//        assertConversion("VI", 6);
//    }
//    @Test
//    public void zwrocDuzaSiudemke() {
//        assertConversion("VII", 7);
//    }
//    @Test
//    public void zwrocDuzaOsemke(){
//        assertConversion("VIII", 8);
//    }

}
