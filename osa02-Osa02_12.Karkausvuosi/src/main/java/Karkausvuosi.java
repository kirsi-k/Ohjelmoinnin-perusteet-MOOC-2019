
import java.util.Scanner;

public class Karkausvuosi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna vuosi:");
        int vuosiluku = Integer.valueOf(lukija.nextLine());

        if (vuosiluku % 400 == 0) {
            System.out.println("Vuosi on karkausvuosi.");
        } else if (vuosiluku % 4 == 0 && vuosiluku % 100 != 0) {
            System.out.println("Vuosi on karkausvuosi.");
        } else {
            System.out.println("Vuosi ei ole karkausvuosi.");
        }
        }
}
