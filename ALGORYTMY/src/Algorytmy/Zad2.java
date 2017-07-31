package Algorytmy;

import java.util.Random;

public class Zad2 extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Zadanie 2";
    }

    @Override
    public void runAlgoritm(String[] input) {
//
//        float[] tabFloat = new float[4];
//        System.out.print(tabFloat[2]);
//
//        int[] tabInt = new int[4];
//        System.out.println( tabInt[3]);

        Random mRand = new Random();

        int[]tab3 = new int[10];
       tab3[1] = mRand.nextInt();

       for(int i=0, j=0; i< tab3.length; i++,j=j+2){//parzyste liczby
           tab3[i]= j;

           System.out.printf("%d\n", tab3[i]);
       }

        System.out.print(tab3[1]);


    }
}
