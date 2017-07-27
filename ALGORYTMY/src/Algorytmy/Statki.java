package Algorytmy;

public class Statki extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Statki";
    }

    @Override
    public void runAlgoritm(String[] input) {

        String literki[] = {" A", " B", " C", " D", " E", " F", " G", " H", " I", " J"," K",
                " L", " M"," N", " O", " P", " R", " S"," T"," U", " W", " X", " Y", " Z"};
        int roz = Integer.parseInt(input[1]);
        if (Math.sqrt(roz) % 1 == 0) {
            int wynik = (int) Math.sqrt(roz);
            String[][] tablicaStatkow = new String[wynik][wynik];

                System.out.println("BLAD");
            for (int i = 0; i < wynik; i++) {
                for (int j = 0; j < wynik; j++) {
                    tablicaStatkow[i][j] = literki[i] + String.valueOf(j + 1);

                    System.out.printf("%s", tablicaStatkow[i][j]);
                }
                System.out.println();
            }


        }

    }
}