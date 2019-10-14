
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku:");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int tokaluku = Integer.valueOf(lukija.nextLine());
        if (ekaluku > tokaluku){
            System.out.println("Suurempi luku on: " + ekaluku);
        } else if (tokaluku > ekaluku){
            System.out.println("Suurempi luku on: " + tokaluku);
        } else if (ekaluku == tokaluku){
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}