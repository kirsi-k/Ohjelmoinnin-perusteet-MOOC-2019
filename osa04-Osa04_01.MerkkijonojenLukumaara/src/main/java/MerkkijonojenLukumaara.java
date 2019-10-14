
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukumaara = 0;
        while (true) {
            String syote = lukija.nextLine();
 
            if (syote.equals("loppu")) {
                break;
            }
 
            lukumaara = lukumaara + 1;
        }
 
        System.out.println(lukumaara);
    }
}


