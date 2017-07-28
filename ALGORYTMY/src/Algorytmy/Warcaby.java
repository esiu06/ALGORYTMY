package Algorytmy;

public class Warcaby extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Warcaby";
    }

    @Override
    public void runAlgoritm(String[] input) {

        String literki[] = {"B", "C"};
        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String kolorPola = input[3];

        String[][] plansza = new String[m][n];

        int licznik;


        for(int i=0; i <m; i++){
            for(int j=0; j<n; j++){
                if (i==0 && j == 0)
                    plansza[i][j]= kolorPola;
                else if(j==0) {
                    if (plansza[i - 1][j].equals("B")) {
                        plansza[i][j] = "C";
                        licznik = 0;
                    } else {
                        plansza[i][j] = "B";
                        licznik = 1;
                    }
                }
                else{
                    if(licznik % 2==0){
                        plansza[i][j]= "C";
                    }
                    else{
                        plansza[i][j] = "B";
                    }
                }
              
                licznik++;
        }

        System.out.printf("%s",plansza[m][n]);
    }
}
}
