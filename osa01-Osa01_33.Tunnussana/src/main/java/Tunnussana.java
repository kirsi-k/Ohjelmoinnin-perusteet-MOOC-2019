
import java.util.Scanner;

public class Tunnussana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Tunnussana?");
        String tunnussana = lukija.nextLine();
        if (tunnussana.equals("Caput Draconis")){
            System.out.println("Tervetuloa!");
        } else {
            System.out.println("Hus siitä!");
        }
    }
}
