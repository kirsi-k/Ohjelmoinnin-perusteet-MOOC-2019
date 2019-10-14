
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkosia = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == 0) {
                    break;    
        }
            if (luku == 1) {
                ykkosia = (ykkosia + 1);
        }
        }
        
        System.out.println(ykkosia);
    }
}
