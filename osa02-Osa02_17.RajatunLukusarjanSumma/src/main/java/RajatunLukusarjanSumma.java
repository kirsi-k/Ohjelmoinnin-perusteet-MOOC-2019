
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int vika = Integer.valueOf(lukija.nextLine());
                
        int tulos = eka + 0;
        int i = eka;
        
        while (i < vika) {
            i = i + 1;
            tulos = tulos + i;
        }
        System.out.println("Summa on " + tulos);
    }
}
