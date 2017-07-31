package Algorytmy;

public class ProsteTablice2 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Proste tablice 2";
    }
    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 2;
        int max = Integer.parseInt(input[1])+1;
        int[]tabSparsowanyWejscia = new int[n];
        for (int i = 0; i<n; i++){
            tabSparsowanyWejscia[i]=Integer.parseInt(input[i+2]);
        }
        int[] tablicaDoZliczen = new int[max];
        for(int i = 0; i<tabSparsowanyWejscia.length; i++){
            int liczba = tabSparsowanyWejscia[i];
            tablicaDoZliczen[liczba]++;
        }
        for(int indeksTablicy=0; indeksTablicy<tablicaDoZliczen.length; indeksTablicy++){
            if(tablicaDoZliczen[indeksTablicy]>0)
            for(int ileLiczb = tablicaDoZliczen[indeksTablicy];
                    ileLiczb !=0; ileLiczb--){
                System.out.printf("%d ", indeksTablicy);
            }
        }
    }
}
