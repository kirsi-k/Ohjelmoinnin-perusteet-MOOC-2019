
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int syote = Integer.valueOf(lukija.nextLine());
        int luku = 0;
        
        while (luku <= syote) {
            System.out.println(luku);
            luku = luku + 1;
        }
    }
}
