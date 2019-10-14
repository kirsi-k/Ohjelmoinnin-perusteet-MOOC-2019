
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int kolmasluku = Integer.valueOf(lukija.nextLine());
        double tulos = ((double) ekaluku + tokaluku + kolmasluku) / 3;
        System.out.println("Syötettyjen lukujen keskiarvo on " + tulos);
    }
}
