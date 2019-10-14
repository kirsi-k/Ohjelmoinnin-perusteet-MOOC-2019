
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosana arvosana = new Arvosana();

        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        int pisteet;
        while (true) {
            pisteet = Integer.valueOf(lukija.nextLine());
            if (pisteet == -1){
                break;
            }
            if (pisteet >= 0 && pisteet <= 100) arvosana.lisaaPisteet(pisteet);
        }
        System.out.println("Pisteiden keskiarvo (kaikki): " + arvosana.keskiarvo());
        
        arvosana.getArvosanat();
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + arvosana.hyvaksyttyjenKeskiarvo());
        
        System.out.println("Hyväksymisprosentti: " + arvosana.hyvaksymisProsentti());
        
        arvosana.tulostaArvosanajakauma();
    }
}
