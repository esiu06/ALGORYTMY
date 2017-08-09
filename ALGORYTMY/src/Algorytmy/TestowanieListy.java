package Algorithms;


import Struktury.mList;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jake on 01.08.2017.
 */
public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Testowanie listy";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //klasa testowa służąca do testowania tablicy
        mList lista = new mList();
        lista.addElementAtBeginning(23, lista);
        lista.addElementAtBeginning(24, lista);
        lista.addElementBeforeElement(25, 24, lista);
        lista.addElementBeforeElement(20, 24, lista);
        lista.addElementAtEnd(10, lista);
        lista.addElementAtEnd(11, lista);
        lista.addElementAfterElement(12, 11, lista);

        lista.printAllElements(lista);

        System.out.printf("Zaczynamy testować usuwanie\n");
        System.out.printf("Usuwam element 25\n");
        lista.deleteElement(25, lista);
        lista.printAllElements(lista);
        System.out.printf("Usuwam element 10\n");
        lista.deleteElement(10, lista);
        lista.printAllElements(lista);



    }
}
