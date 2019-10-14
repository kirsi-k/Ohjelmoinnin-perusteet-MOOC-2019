
import java.io.File;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
 
    Scanner lukija = new Scanner(System.in);
        
    try (Scanner tiedostonLukija = new Scanner(new File("data.txt"))) {

    while (tiedostonLukija.hasNextLine()) {
        // luetaan yksi rivi
        String rivi = tiedostonLukija.nextLine();
        // tulostetaan luettu rivi
        System.out.println(rivi);
    }
}   
    catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
    }
}
}