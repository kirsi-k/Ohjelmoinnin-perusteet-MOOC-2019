
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
        int syote = Integer.valueOf(lukija.nextLine());
        int tulos = 0;
        int i = 0;
        
        while (i < syote) {
            i = i + 1;
            tulos = tulos + i;
        }
        System.out.println("Summa on " + tulos);
    }
}
