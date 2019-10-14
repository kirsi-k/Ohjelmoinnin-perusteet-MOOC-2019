
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int syote = Integer.valueOf(lukija.nextLine());
        
        while (syote <= 100) {
            System.out.println(syote);
            syote = syote + 1;
        }
    }
}
