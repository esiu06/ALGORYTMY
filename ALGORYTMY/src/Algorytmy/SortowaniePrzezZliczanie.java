package Algorytmy;

public class SortowaniePrzezZliczanie extends AbstractAlgoritm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = input.length - 2;
        int max = Integer.parseInt(input[1]) + 1;
        int[] tabWejsc = new int[n];
        for (int i = 0; i < n; i++) {
            tabWejsc[i] = Integer.parseInt(input[n + 2]);
        }
        int[] tabZliczen = new int[max];
        for (int i = 0; i < tabWejsc.length; i++) {
            int liczba = tabWejsc[i];
            tabZliczen[liczba]++;
        }
        for (int i = 0; i < tabZliczen.length; i++) {
            if (tabZliczen[i] > 0)
                for (int j = tabZliczen[i]; j > 0; j--) {
                    System.out.println("%d");
                }
        }
    }
}

