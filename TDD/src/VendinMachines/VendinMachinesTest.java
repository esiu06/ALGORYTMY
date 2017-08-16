package VendinMachines;

import org.junit.Assert;
import org.junit.Test;

public class VendinMachinesTest {

    @Test
    public void nothing(){
        Kasa kasa = null;
        Produkty produkty = null;
        VendingMachine vendingMachine = new VendingMachine(kasa, produkty);
    }


//    @Test
//    public void whenChoosingProductWithoutMoneyNothingHappens(){
//        String result = vendingMachine.execute("A");
//
//        Assert.assertEquals("",result);
//    }
//    @Test
//    public void whenInsertNotEnoughMoneyAndPressProductGivMoneyBack(){
//        String result = vendingMachine.execute("DA");
//
//        Assert.assertEquals("D",result);
//    }
//    @Test
//    public  void whenInsertQuartetWaniQuarterBack(){
//        String result = vendingMachine.execute("QA");
//        Assert.assertEquals("Q", result);
//    }
//    @Test
//    public void whenInsertMoreThanOneCoinShouldReturnThemAll(){
//        String result = vendingMachine.execute("DQNdA");
//        Assert.assertEquals("DQNd", result);
//    }
//    @Test
//    public void whenClickAShouldntGetAWithoutMoney() {
//        String result = vendingMachine.execute("AA");
//        Assert.assertEquals("", result);
//    }
}
