package Algorithms;

import java.util.Stack;

/**
 * Created by JMaterac on 03.08.2017.
 */
public class PrzeliczanieSystemow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Stosowe przeliczanie systemów dziesiętnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int liczba = Integer.parseInt(input[1]); //parsuje sobie liczbę
        int podstawa  = Integer.parseInt(input[2]); //parsuje sobie podstawę
        //na którą chce przeliczać

        Stack<Integer> stos = new Stack<>(); //Tworzę nowy stos
        //Zauważ, że przy deklaracji korzystam z klasy opakowującej!

        while(liczba > 0) //dopóki liczba jest większa od 0 oznacza to
        //że mogę jeszcze ją podzielić i dorzucić na stos wynik modulo
        {
            stos.push(liczba % podstawa);
            liczba = liczba / podstawa;
        }

        //Wypisywanie stosu
        while (!stos.empty()) {
            //TODO co w przypadku HEX?
            System.out.printf("%d", stos.pop());
        }
    }
}
