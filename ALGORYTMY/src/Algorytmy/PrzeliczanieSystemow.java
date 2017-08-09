<<<<<<< HEAD
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
=======
package Algorytmy;

import java.util.Stack;

public class PrzeliczanieSystemow extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Stos";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        int p = Integer.parseInt(input[2]);

        Stack<Integer> Stos = new Stack<>();

        while (n > 0) {
            Stos.push(n % p);
            n = n/p;
        }

        while (!Stos.empty()) {
            System.out.println(Stos.pop());
>>>>>>> 9df602c3c24e5310e686bf226b8aabcbadb66956
        }
    }
}
