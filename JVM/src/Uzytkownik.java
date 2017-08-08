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
        System.out.println("Podaj liczby");
        liczba1 = liczby.nextInt();
        liczba2 = liczby.nextInt();

        System.out.print(liczba1 + liczba2);
    }

}
