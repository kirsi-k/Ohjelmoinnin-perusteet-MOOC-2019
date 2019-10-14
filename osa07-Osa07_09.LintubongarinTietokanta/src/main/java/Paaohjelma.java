
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        Lintutietokanta lintutietokanta = new Lintutietokanta();
        String komento = "";
        while (!komento.equals("Lopeta")) {
            System.out.print("? ");
            komento = lukija.nextLine();
            String nimi = "";
            switch (komento.toLowerCase()) {
                case "lisaa":
                    System.out.print("Nimi: ");
                    nimi = lukija.nextLine();
                    System.out.print("Latinakielinen nimi: ");
                    String latinaNimi = lukija.nextLine();
                    lintutietokanta.lisaa(nimi, latinaNimi);
                    continue;
                case "havainto":
                    System.out.print("Mikä havaittu? ");
                    nimi = lukija.nextLine();
                    lintutietokanta.lisaaHavainto(nimi);
                    continue;
                case "tilasto":
                    lintutietokanta.naytaTilasto();
                    continue;
                case "nayta":
                    System.out.println("Mikä? ");
                    nimi = lukija.nextLine();
                    lintutietokanta.naytaLintu(nimi);
                    continue;
                case "lopeta":
                    break;
                default:
                    System.out.println("Komentoa ei löydy");
                    break;
            }
        }
       }
    }
