package Algorytmy;

public class Zadanie1 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zadanie pierwsze";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int []tablica= new int[input.length-1];
        for(int i=0; i<tablica.length; i++){
            tablica[i] = Integer.parseInt(input[i+1]);
        }

        for (int i=0; i<tablica.length; i++){
            for(int j = 0; j<i; j++){
                if(tablica[i] == tablica[j]) {
                    System.out.println("Znaleziono duplikat: " + i + " " + j);
                    return;
                }

            }
        }

        System.out.println("NIema duplikatu");

    }
}
