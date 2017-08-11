import org.junit.Assert;
import org.junit.Test;

public class SortowanieBabelkoweTest {
    SortowanieBabelkowe testObjekt = new SortowanieBabelkowe();

    @Test
    public void sortowanieBabelkowe(){
        Assert.assertArrayEquals(new int[0], new int[]{testObjekt.sort(0)});
    }
}

