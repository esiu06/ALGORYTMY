package Algoritm;

import Algoritm.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public class Test extends AbstractAlgoritm {
    public Test(){// konstuktor
        System.out.println("Konstruktor TEST");
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public void runAlgoritm(String[] input) {
        System.out.println("To jest algorytm testowy");

    }
}
