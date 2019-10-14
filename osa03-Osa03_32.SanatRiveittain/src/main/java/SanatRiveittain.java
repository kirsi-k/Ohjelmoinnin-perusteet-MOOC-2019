
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
         while (true) {
            String merkkijono = lukija.nextLine();
 
            if (merkkijono.equals("")) {
                break;
            }
            String[] palat = merkkijono.split("\\s+");
            int indeksi = 0;
            while (indeksi < palat.length) {
                System.out.println(palat[indeksi]);
                indeksi = indeksi + 1;
}
    }
}
}
