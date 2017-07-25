package Algorytmy;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumaLiczb2 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Suma liczb 2";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = Integer.parseInt(input[1]);

        System.out.println(SumaLiczb2(n));

    }
    private  int SumaLiczb2(int n){
        if (n<2)
            return 1;

        return n*SumaLiczb2(n-1);


    }
}

