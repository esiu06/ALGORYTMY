import java.util.Scanner;

/**
 *
 */
public class Uzytkownik {
    /**
     * scaner pobiera liczby
     *
     */
    public void pobierzLiczby() {
        Scanner liczby = new Scanner(System.in);
        int liczba1;
        int liczba2;
        int wynik;
        System.out.println("Podaj pierwszą liczbę");
        liczba1 = liczby.nextInt();
        System.out.println("Podaj drugą liczbę");
        liczba2 = liczby.nextInt();
        wynik = liczba1 + liczba2;

        System.out.print("Wynik dodawania: \n" + wynik);
    }

}
