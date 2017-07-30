package Algorytmy;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumaLiczb extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Suma liczb";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int i = 1;
        for( i=0; i< input.length; i++){
            int suma = n;
            System.out.println(suma);
        }
    }
}
