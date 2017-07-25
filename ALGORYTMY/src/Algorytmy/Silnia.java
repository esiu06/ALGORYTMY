package Algorytmy;

/**
 * Created by RENT on 2017-07-25.
 */
public class Silnia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Liczenie silni";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Silnia(n));

    }
    private int Silnia(int n){
        if(n<2)
            return 1;

        return n * Silnia(n-1);
    }
}
