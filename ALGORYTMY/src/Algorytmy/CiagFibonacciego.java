package Algorytmy;

/**
 * Created by RENT on 2017-07-25.
 */
public class CiagFibonacciego extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ciag Fibonacciego";
    }
    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.printf("Ciag Fibunacciego %d wynosi %d: ",  n, Fiboncci(n));
    }
    private int Fiboncci(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return Fiboncci(n-1)+ Fiboncci(n-2);
        }
    }
}
