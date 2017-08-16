package Algorytmy;

import Struktury.Kopiec;

/**
 * Created by JMaterac on 03.08.2017.
 */
public class TestowanieKopca extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Testowanie kopca";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 1;
        Kopiec kopiec = new Kopiec(n);

        for(int i = 1; i < input.length; i++){
            int newElement = Integer.parseInt(input[i]);
            kopiec.addNewElement(newElement);
        }

        kopiec.printAllElements();

        kopiec.sort();
    }
}
