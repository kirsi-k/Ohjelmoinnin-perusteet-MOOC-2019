
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna 1. sana: ");
        String ekasana = lukija.nextLine();
        System.out.print("Anna 2. sana: ");
        String tokasana = lukija.nextLine();
        
        int indeksi = ekasana.indexOf(tokasana);
        
        if (indeksi == -1) {
            System.out.println("Sana " + tokasana + " ei ole sanan " + ekasana + " osana.");
        } else {
            System.out.println("Sana " + tokasana + " on sanan " + ekasana + " osana.");
        }

    }
}
