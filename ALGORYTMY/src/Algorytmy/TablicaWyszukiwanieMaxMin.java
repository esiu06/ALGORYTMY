package Algorithms;

/**
 * Created by jake on 31.07.2017.
 */
public class TablicaWyszukiwanieMaxMin extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyszukiwanie max i min";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1;
        int tablicaDoAnalizy[] = new int[n];

        for(int i = 0; i < tablicaDoAnalizy.length; i++){
            tablicaDoAnalizy[i] = Integer.parseInt(input[i+1]); //parsujemy każdy element i zapisujemy do tablicy
        }

        int max = 0, min = 0; //tworzę zmienne min i max, które będą trzymać indeks elementu kolejno największego i najmniejszego

        for(int i = 0; i < tablicaDoAnalizy.length; i++) //przechodzę po całej tablicy do analizy
        {
            if(tablicaDoAnalizy[i] > tablicaDoAnalizy[max]) //jeżeli element w tablicy pod indeksem aktualnie przetwarzanym
                //jest większy od elementu kryjącego się w tablicy pod indeksem max
                max = i; //to teraz moim nowym maxem jest element kryjący się w tablicy pod i
            if(tablicaDoAnalizy[i] < tablicaDoAnalizy[min]) //jeżeli element w tablicy pod indeksem aktualnie przetwarzanym
                //jest mniejszy od elementu kryjącego się w tablicy pod indeksem min
                min = i; //to teraz moim nowym minem jest element kryjący się w tablicy pod i
        }

        System.out.printf("Największym elementem jest %d o wartości %d\n", max, tablicaDoAnalizy[max]);
        System.out.printf("Najmniejszym elementem jest %d o wartości %d\n", min, tablicaDoAnalizy[min]);

    }
}
