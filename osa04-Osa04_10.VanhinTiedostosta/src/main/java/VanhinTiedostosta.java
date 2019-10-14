
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int vanhinIka = -1;
        String vanhin = ("");

        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {

        while (tiedostonLukija.hasNextLine()) {
            String rivi = tiedostonLukija.nextLine();
            
        String[] osat = rivi.split(",");

        String nimi = osat[0];
        int ika = Integer.valueOf(osat[1]);
        
        if (vanhinIka == -1 || ika > vanhinIka) {
                vanhinIka = ika;
                vanhin = nimi;
        }
        }
    } catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
    }  
        System.out.println("Vanhin oli: " + vanhin);   
    }
}
