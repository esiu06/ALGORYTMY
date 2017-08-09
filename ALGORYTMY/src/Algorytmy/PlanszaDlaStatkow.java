package Algorithms;

/**
 * Created by jake on 27.07.2017.
 */
public class PlanszaDlaStatkow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Plansza dla statków";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "W", "V", "X",
            "Y", "Z"}; //Tablica literek, która prezentuje nasz alfabet

    @Override
    public void runAlgorithm(String[] input) {
        //Zadanie to ma na celu ćwiczenie działań na Stringach i tablicach dwuwymiarowych

        int liczbaDoSpierwiastkowania = Integer.parseInt(input[1]); //jedynym argumentem jest liczba,
        // którą musimy sprawdzić czy da się ją idealnie spierwiastkować

        if(!(Math.sqrt(liczbaDoSpierwiastkowania)%1==0)) //Sztuczka mająca na celu sprawdzenie czy da się spierwiastkować
            //liczbę bez części dziesiętnej
        {
            System.out.println("Liczby nie da się spierwiastkować całkowitoliczbowo!");
            return; //jeżeli się nie da (zauważ symbol ! w ifie) to kończymy działanie
        }

        int rozmiar = (int)Math.sqrt(liczbaDoSpierwiastkowania); //pierwiastkujemy i rzutujemy na inta liczbę
        String[][] statki = new String[rozmiar][rozmiar]; //tworzymy nową tablicę dwuwymiarową, w
        // której będziemy zapisywać współrzędne statków

        for(int i = 0; i < rozmiar; i++)
            for(int j=0; j < rozmiar; j++)
                statki[i][j] = _letters[i] + (j+1); //każdemu elementowi w tablicy przypisujemy jego współrzędną
        //korzystamy z konkatenacji stringów, czyli dodajemy jeden string do drugiego


        for(int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++)
                System.out.printf("%s ", statki[i][j]); //drukujemy tablicę

            System.out.printf("\n");
        }
    }
}
