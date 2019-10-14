
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna sana: ");
        String sana = lukija.nextLine();
        System.out.print("Alkuosan pituus: ");
        int alkuosanPituus = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Tulos: " + sana.substring(0, alkuosanPituus));
        
        
    }
}
