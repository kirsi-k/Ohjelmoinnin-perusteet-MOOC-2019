
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ekaluku = Integer.valueOf(lukija.nextLine());
        int tokaluku = Integer.valueOf(lukija.nextLine());
        
        int summa = (ekaluku + tokaluku);
        double neliojuuri = Math.sqrt (summa);
        
        System.out.println(neliojuuri);
    }
}
