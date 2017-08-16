package Algorytmy;

import java.util.Random;

/**
 * Created by jake on 31.07.2017.
 */
public class TabliceCwiczenia extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Cwiczenia tablic";
    }

    @Override
    public void runAlgoritm(String[] input) {
        //Przypisanie losowej wartości kolejnym elementom tablicy
        Random rand = new Random(); //Tworzenie obiektu odpowiedzialnego za generowanie losowych liczb
        int losowe[] = new int[10];
        System.out.println("Losowe wartości");
        for(int i = 0; i < losowe.length; i++){
            losowe[i] = rand.nextInt(); //przypisuje losową wartość konkretnemu elementowi tablicy
            System.out.println(losowe[i]);
        }

        //Przypisanie kolejnych liczb parzystych kolejnym elementom tablicy
        int parzyste[] = new int[10];
        System.out.println("Parzyste wartości");
        for (int i = 0, j = 0; i < parzyste.length; i++, j+=2) //jeden ze sposobów aby jednocześnie utworzyć dwa iteratory
        {
            parzyste[i] = j;
            System.out.println(parzyste[i]);
        }

        //Przypisanie kolejnych liczb nieparzystych kolejnym elementom tablicy
        int nieParzyste[] = new int[10];
        System.out.println("Nieparzyste wartości");
        for (int i = 0, j = 1; i < nieParzyste.length; i++, j+=2){
            nieParzyste[i] = j;
            System.out.println(nieParzyste[i]);
        }

        //Obsługa wyjątku
        int wyjatkowaTablica[] = new int[10];
        try //Zabezpieczamy się na wypadek wyjścia poza zakres stawiając "pułapkę"
        {
            for(int i = 0; i <= wyjatkowaTablica.length; i++) //specjalnie wychodzimy poza zakres
            {
                wyjatkowaTablica[i] = i;
                System.out.println(i + " jesteś w tablicy");
            }
        }
        catch (Exception ex) //Wyszliśmy poza zakres i program wyrzuca wyjątek, który obsługujemy
        {
            System.out.println("Wyszedłeś poza zakres!");
            System.out.println("Ale ponieważ obsłużyliśmy wyjątek program leci dalej!");
        }

        System.out.println("Jestem tuuuu!"); //Udowadniamy, że się nie zawiesiliśmy tylko po
        //obsłużeniu wyjątku poszliśmy dalej z kodem.

    }
}
