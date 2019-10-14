
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
       Scanner lukija = new Scanner(System.in);

        Sailio ensimmainenSailio = new Sailio();
        Sailio toinenSailio = new Sailio();
 
        while (true) {
            System.out.println("Ensimmäinen: " + ensimmainenSailio.toString());
            System.out.println("Toinen: " + toinenSailio.toString());
            System.out.print("> ");
 
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
 
            String[] osat = luettu.split(" ");
            luettu = osat[0];
            int maara = Integer.valueOf(osat[1]);
 
            if (luettu.equals("lisaa")) {
                ensimmainenSailio.lisaa(maara);
                }
 
            if (luettu.equals("siirra")) {
                if (maara > ensimmainenSailio.sisalto()){
                    maara = ensimmainenSailio.sisalto();
                }
                toinenSailio.lisaa(maara);
                ensimmainenSailio.poista(maara);
                }

            if (luettu.equals("poista")) {
                toinenSailio.poista(maara);
                }
            }
 
            System.out.println("");
        }
    }

