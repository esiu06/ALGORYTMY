package Algorithms;

/**
 * Created by jake on 29.07.2017.
 */
public class Sprawdzian extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sprawdzian i odpowiedzi";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //Pobieramy odpowiedzi chłopaków
        String kubaAnswers = input[1];
        String zenekAnswers = input[2];
        String bogdanAnswers = input[3];

        //Sprawdzamy czy ilości odpowiedzi się zgadzają
        if(!(kubaAnswers.length() == zenekAnswers.length()) &&
                !(kubaAnswers.length() == bogdanAnswers.length()))
        {
            System.out.println("Długości odpowiedzi się nie zgadzają!");
            return;
        }

        //Po kolei parsujemy odpowiedzi do tablic charów
        //w ten sposób będziemy mogli bez zbędnej kombinacji je porównać
        //i za darmo mamy rozbicie na poszczególne odpowiedzi
        char[] kubaAnswersAsLetters = kubaAnswers.toCharArray();
        char[] zenekAnswersAsLetters = zenekAnswers.toCharArray();
        char[] bogdanAnswersAsLetters = bogdanAnswers.toCharArray();

        int correctAnswers = 0; //licznik, który zliczy nam odpowiedzi

        for(int i = 0; i< kubaAnswers.length(); i++)
        {
            if(kubaAnswersAsLetters[i] != zenekAnswersAsLetters[i]) //jeżeli Zenek ma inną odpowiedź niż Kuba
                //jest szansa na to, że udało mu się trafić więc zwiększamy licznik
                correctAnswers++;

            if(kubaAnswersAsLetters[i] != bogdanAnswersAsLetters[i]) //podobnie sprawa ma się z odpowiedziami Bogdana
                correctAnswers++;
        }

        System.out.printf("Ilość poprawnych odpowiedzi: %d", correctAnswers);

    }
}
