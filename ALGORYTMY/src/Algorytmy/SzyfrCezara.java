package Algorytmy;

/**
 * Created by RENT on 2017-07-25.
 */
public class SzyfrCezara extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "Szyfr Cezara";
    }

    private String _letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "Z"};

    @Override
    public void runAlgoritm(String[] input) {
        for (int words = 1; words < input.length; words++) {
            String word = input[words].toUpperCase();
            char lettersInWord[] = word.toCharArray();
            for (int letter = 0; letter < lettersInWord.length; letter++) {

            int position = getLetterPosition(Character.toString(lettersInWord[letter]));
            int move = (position + 3)%_letters.length;
            System.out.printf("%s", _letters[move]);
        }
    }

}
private  int getLetterPosition(String letter){
    for (int i=0; i<_letters.length; i++){
        if(letter.equals(_letters[i])){
            return i;

        }
    }
    return -1;

}
}

