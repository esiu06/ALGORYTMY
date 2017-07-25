package Algorytmy;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumowanieLiczbNaturalnych extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = Integer.parseInt(input[1]);

        int suma = 0;

        int i = 1;

        while(i<=n) {
            suma += i;
            System.out.printf("Intencja: %d ::: Wartość sumy: %d \n", i, suma);
            i++;
        }
        System.out.println(suma);

    }

    }

