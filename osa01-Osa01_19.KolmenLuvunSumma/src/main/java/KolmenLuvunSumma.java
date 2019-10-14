
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int kolmasluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + (ekaluku + tokaluku + kolmasluku));
    }
}
