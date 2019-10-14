
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
       
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut:");
        int summa = 0;
        int lukujenMaara = 0;
        int parillisia = 0;
        int parittomia = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
 
            if (luku == -1) {
                break;
            } 
            summa = summa + luku;
            lukujenMaara = lukujenMaara + 1;
            
            if (luku % 2 == 0) {
                parillisia = parillisia + 1;
            } else {
                parittomia = parittomia + 1;
            }
    }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukujenMaara);
        System.out.println("Keskiarvo: " + (1.0 * summa / lukujenMaara));
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);
}
}