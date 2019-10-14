
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String tunnus1 = ("aleksi");
        String salasana1 = ("tappara");
        String tunnus2 = ("elina");
        String salasana2 = ("kissa");
        
        System.out.print("Anna tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna salasana: ");
        String salasana = lukija.nextLine();
        
        if (tunnus.equals(tunnus1) && salasana.equals(salasana1)) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else if (tunnus.equals(tunnus2) && salasana.equals(salasana2)){
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
