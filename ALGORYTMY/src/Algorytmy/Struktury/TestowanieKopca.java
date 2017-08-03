package Algorytmy.Struktury;

import Algorytmy.AbstractAlgoritm;

public class TestowanieKopca extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Kopiec";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        Kopiec kopiec = new Kopiec(n);

        for (int i = 1; i < input.length; i++) {
            int element = Integer.parseInt(input[i]);

            kopiec.insertElement(element);
        }
        kopiec.printAllElement();

    }
}
