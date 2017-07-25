package Algorytmy;

/**
 * Created by RENT on 2017-07-24.
 */
public class Wypłata extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Wypłata";
    }

    @Override
    public void runAlgoritm(String[] input) {


        int[] zl = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] gr = {50, 20, 10, 5, 2, 1};

        int wyplata1 = Integer.parseInt(input[1]);
        int wyplata2 = Integer.parseInt(input[2]);

        int[] wyplatazl = new int[8];
        int[] wyplatagr = new int[6];

        while (wyplata1 > 0) {
            for (int i = 0; i < zl.length; i++) {
                if (wyplata1 >= zl[i]) {
                    wyplata1 = wyplata1 - zl[i];
                    wyplatazl[i]++;
                    break;
                }
            }
        }
        while (wyplata2 > 0) {
            for (int i = 0; i < gr.length; i++) {
                if (wyplata2 >= gr[i]) {
                    wyplata2 = wyplata2 - gr[i];
                    wyplatagr[i]++;
                    break;
                }
            }
        }

        for(int i=0; i<wyplatazl.length;i++){
            System.out.printf("%d\n", wyplatazl[i]);
        }



    }
}
