package Algorytmy;

import java.util.Stack;

public class OdwrotnaNotacjaPolska extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Odwrotna Notacja Polska";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Stack<Integer> Stos = new Stack<>();

        int element;
        int zmienna1=0;
        int zmienna2=0;

   for (int i=1; i<input.length; i++){
            switch (input[i])
            {
                case "D":
                    zmienna1 = Stos.pop();
                    zmienna2 = Stos.pop();
                    Stos.push(zmienna1 + zmienna2);
                    break;
                case "O":
                    zmienna1 = Stos.pop();
                    zmienna2 = Stos.pop();
                    Stos.push(zmienna1 - zmienna2);
                    break;
                case "M":
                    zmienna1 = Stos.pop();
                    zmienna2 = Stos.pop();
                    Stos.push(zmienna1 * zmienna2);
                    break;
                case"I":
                    zmienna1 = Stos.pop();
                    zmienna2 = Stos.pop();
                    Stos.push(zmienna1 / zmienna2);
                    break;
                case"R":
                    System.out.println(Stos.pop());
                    break;
                default:
                    Stos.push(Integer.parseInt(input[i]));
                    break;

            }
        }

    }
}
