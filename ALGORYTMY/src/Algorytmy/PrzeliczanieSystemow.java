package Algorytmy;

import java.util.Stack;

public class PrzeliczanieSystemow extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Stos";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        int p = Integer.parseInt(input[2]);

        Stack<Integer> Stos = new Stack<>();

        while (n > 0) {
            Stos.push(n % p);
            n = n/p;
        }

        while (!Stos.empty()) {
            System.out.println(Stos.pop());
        }
    }
}
