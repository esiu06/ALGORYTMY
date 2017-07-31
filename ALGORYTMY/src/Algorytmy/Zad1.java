package Algorytmy;

import java.util.Random;

public class Zad1 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zadanie1";
    }

    @Override
    public void runAlgoritm(String[] input) {

        Random mRand = new Random (12);//nigdy z tego nie korzystaj jest niebezpieczne
        System.out.printf("%d", mRand.nextInt());
    }
}
