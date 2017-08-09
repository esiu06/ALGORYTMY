package Algorithms;

/**
 * Created by jake on 27.07.2017.
 */
public class NajwiekszyWspolnyDzielnik extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Największy wspólny dzielnik";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        System.out.println(NWD(k, n));
    }

    private int NWD(int k, int n){
        if(k == 0)
            return n;

        return NWD(n%k, k);
    }
}
