package Algorytmy;

/**
 * Created by jake on 31.07.2017.
 */
public class DataWielkanocy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Wyznaczanie daty Wielkanocy";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int rok = Integer.parseInt(input[1]);

        //Do omówienia zadania potrzebny jest zbiór zadań - zadanie 1
        int a = rok % 19;
        int b = (rok / 100);
        int c = rok % 100;
        int d = b / 4;
        int e = b % 4;
        int f = ((b + 8) / 25);
        int g = ((b - f + 1) / 3);
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int p = (h + l - 7 * m + 114) % 31;

        int dzien = p + 1;
        int miesiac = (h + l - 7 * m + 114) / 31;

        System.out.printf("%d ", dzien);
        if(miesiac != 4){
            System.out.printf("marca %d roku", rok);
        }
        else{
            System.out.printf("kwietnia %d roku", rok);
        }
    }
}
