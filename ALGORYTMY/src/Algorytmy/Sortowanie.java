package Algorytmy;

/**
 * Created by RENT on 2017-07-26.
 */
public class Sortowanie extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Sortowanie";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int tab[] = new int[input.length - 1];

        for(int i = 0; i< input.length-1; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab.length-1; j++){
                if(tab[j]>tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }

            }

        }
        for (int i=0;i<tab.length; i++)
            System.out.println(tab[i]);

    }
}
