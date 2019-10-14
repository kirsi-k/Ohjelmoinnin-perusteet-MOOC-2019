
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mitä tulostetaan?");
        String tulostus = lukija.nextLine();
        
        System.out.print(tulostus + tulostus + tulostus);

    }
}
