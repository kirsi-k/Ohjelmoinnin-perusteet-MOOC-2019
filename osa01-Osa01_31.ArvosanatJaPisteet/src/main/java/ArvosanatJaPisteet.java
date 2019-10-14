
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int pisteet = Integer.valueOf(lukija.nextLine());
        if (pisteet < 0){
            System.out.println("Arvosana: mahdotonta!");
        } else if (pisteet <= 49) {
            System.out.println("Arvosana: hylätty");
        } else if (pisteet <= 59) {
            System.out.println("Arvosana: 1");
        } else if (pisteet <= 69) {
            System.out.println("Arvosana: 2");
        } else if (pisteet <= 79) {
            System.out.println("Arvosana: 3");
        } else if (pisteet <= 89) {
            System.out.println("Arvosana: 4");
        } else if (pisteet <= 100) {
            System.out.println("Arvosana: 5");
        } else if (pisteet > 100) {
            System.out.println("Arvosana: uskomatonta!");
        }
    }
}
