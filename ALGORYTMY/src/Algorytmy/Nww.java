package Algorytmy;

public class Nww extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Najwieksza wspolna wielokrotnosc";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println(k * n / nwd(k,n));
    }
    public int nwd(int k, int n){
        if( k==0){
            return n;
        }
        return nwd (n%k , k);
    }

}
