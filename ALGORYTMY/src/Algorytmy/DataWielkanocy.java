package Algorytmy;

public class DataWielkanocy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Data Wielkanocy";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int rok = Integer.parseInt(input[1]);

    int a = rok % 19;
    int b = (int)(rok/100);
    int c = rok%100;
    int d = (int)b/4;
    int e = b%4;
    int f = (int)((b+8)/25);
    int g = (int)((b-f+1)/3);
    int h = (19*a+b-d-g+15)%30;
    int i = (int)c/4;
    int k = c%4;
    int l = (32+2*e+2*i-h-k)%7;
    int m = (int)(a+11*h+22*l)/451;
    int p = (h+l-7*m+114)%31;

    int Dzien = p+1;
    int Miesiac = (int)(h+l-7*m+114)/31;

        System.out.printf("%d, %d, %d", Dzien, Miesiac,rok );
    }
}
