package Algorytmy.Struktury;

import Algorytmy.AbstractAlgoritm;

public class TestowanieListy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Testowanie listy";
    }

    @Override
    public void runAlgoritm(String[] input) {
        mList lista = new mList();

        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addelementBeforeElement(45, 14, lista);
        lista.printAllElement(lista);

    }
}
