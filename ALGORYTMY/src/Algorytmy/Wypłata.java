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


       int[] zl  = {200, 100, 50, 20,10, 5, 2, 1};
        int[] gr = {50,20,10, 5, 2, 1};

        int wyplata1 = Integer.parseInt(input[1]);
        int wyplata2 = Integer.parseInt(input[2]);

        int[] wyplatazl = new int[8];
        int[] wyplatagr = new int[6];

        while( wyplata1>0) {

            for (int i = 0; i < zl.length; i++) {
                if (wyplatazl[i] >= zl[i]) ;
                wyplatazl[i] = wyplatazl[i] - zl[i];
                wyplatazl[i]++;
                break;
            }
        }
        while (wyplata2>0){
            for( int j=0; j< gr.length; j++){
                if( wyplatagr[j] >= gr[j]);
                    wyplatagr[j] = wyplatagr[j] - gr[j];
                wyplata2++;
                break;
            }

        }

    }
}
