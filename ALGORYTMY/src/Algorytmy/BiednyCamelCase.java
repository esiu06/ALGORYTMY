package Algorytmy;

public class BiednyCamelCase extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }
    @Override
    public void runAlgoritm(String[] input) {
        int literki = 0;
        for (int i = 1; i < input.length; i++) {
            String word = input[i];
            char[] lettersInWord = word.toCharArray();
            for (int lettersCounter = 0; lettersCounter < lettersInWord.length; lettersCounter++)
            {if (literki % 2 == 0) {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toUpperCase());
                } else {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toLowerCase());
                }
                literki++;
            }
            System.out.print(" ");
        }
    }
}


