
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ekaluku = Integer.valueOf(lukija.nextLine());
        int tokaluku = Integer.valueOf(lukija.nextLine());
        
        if (ekaluku > tokaluku) {
            System.out.println("Luku " + ekaluku + " on suurempi kuin luku " + tokaluku);
        }
        else if (ekaluku < tokaluku) {
            System.out.println("Luku " + ekaluku + " on pienempi kuin luku " + tokaluku);
        }
        else if (ekaluku == tokaluku) {
            System.out.println("Luku " + ekaluku + " on yhtä suuri kuin luku " + tokaluku);
        }
    }
}
