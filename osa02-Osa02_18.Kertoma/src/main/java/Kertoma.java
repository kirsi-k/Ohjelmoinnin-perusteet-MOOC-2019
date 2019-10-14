
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku:");
        int syote = Integer.valueOf(lukija.nextLine());
        int kertoma = 1;
        int i = 0;
        
        while (i < syote) {
            i = i + 1;
            kertoma = kertoma * i;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}
