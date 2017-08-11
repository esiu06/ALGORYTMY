package Algorytmy;

/**
 * Created by jake on 29.07.2017.
 */
public class Dominanta extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Szukanie dominanty wersja bogata";
    }

    @Override
    public void runAlgoritm(String[] input) {
        //Wersja uproszczona

        int amountOfElements = input.length - 1;
        int max = 0;

        int[] T = new int[amountOfElements];

        for(int i = 0; i < amountOfElements; i++) //Parsujemy nasze wejście  i od razu szukamy największego elementu
        {
            T[i] = Integer.parseInt(input[i + 1]);
            if(T[i] > max) //jeżeli obecnie przetwarzany element jest większy od maxa to stanie się on naszym nowym maxem
                max = T[i];
        }

        int L[] = new int[max+1]; //Tworzymy pomocniczą tablicę i od razu dajmey jej wartość max+1

        for(int i = 0; i < amountOfElements; i++) //Robimy zliczanie jak w sortowaniu przez zliczanie
        {
            int number = T[i];
            L[number]++;
        }

        int result = 0; //tutaj będziemy trzymać INDEKS elementu, którego wartość jest największa
        for(int i = 0; i < L.length; i++){
            if(L[i] > L[result]) //jeżeli wartość obecnie przetwarzanego elementu (L[i]) jest większa od elementu, który
                //do tej pory oznaczaliśmy największym (L[result]) to on będzie naszym nowym indeksem. Pamiętajmy, że przechowujemy indeksy
                //a nie wartości
            {
                result = i;
            }
        }


        System.out.printf("Najczęściej występująca wartość: %d wystąpiła %d razy.", result, L[result]);

    }
}
