import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptit = new ArrayList<>();
        
        System.out.print("Mistä luetaan? ");
        String tiedosto = lukija.nextLine();
        System.out.println("");
        System.out.println("Komennot:");
        System.out.println("");
        System.out.println("listaa - listaa reseptit");
        System.out.println("lopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella");
        System.out.println("");
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            

            try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
                while (tiedostonLukija.hasNextLine()) {
                    String reseptinNimi = tiedostonLukija.nextLine();
                    if (reseptinNimi.isEmpty()) {
                        break;
                    }
    //                System.out.println(reseptinNimi);
                    Resepti resepti = new Resepti(reseptinNimi);
                    reseptit.add(resepti);

                    int keittoAika = Integer.parseInt(tiedostonLukija.nextLine());
                    resepti.lisaaKeittoaika(keittoAika);

    //                System.out.println(keittoAika);

                    while (tiedostonLukija.hasNextLine()) {
                        String raakaAine = tiedostonLukija.nextLine();
    //                    System.out.println(raakaAine);
                        if (raakaAine.isEmpty()) {
                            break;
                        }
                        resepti.lisaaRaakaAine(raakaAine);
                    }
                }
            } catch (Exception e) {
                System.out.println("Virhe" +e.getMessage());
            }
            if (komento.equals("listaa")){
                System.out.println("");
                System.out.println("Reseptit");
                    for (int i = 0; i < reseptit.size(); i++) {
                        System.out.println(reseptit.get(i));
                    }
                System.out.println("");    
            } else if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
            
                for (int i = 0; i < reseptit.size(); i++) {
                    if (reseptit.get(i).getNimi().contains(haettava)) {
                        System.out.println(reseptit.get(i));
                    }
                System.out.println(""); 
                }
            } else if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int haettava = Integer.parseInt(lukija.nextLine());
            
                for (int i = 0; i < reseptit.size(); i++) {
                    if (reseptit.get(i).getKeittoaika() <= haettava) {
                        System.out.println(reseptit.get(i));
                    }
                System.out.println(""); 
                }
                
            } else if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
            
                for (int i = 0; i < reseptit.size(); i++) {
                    if (reseptit.get(i).haeRaakaAine(haettava)) {
                        System.out.println(reseptit.get(i));
                    }
                System.out.println(""); 
            }
        }
        }
    }

}
