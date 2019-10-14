
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        int i = 0;
        while (i < maara) {
            System.out.print("*"); 
            i++;
        }
        System.out.println("");
    }
    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        int tulostettu = 0;
        while (tulostettu < maara) {
            System.out.print(" ");
            tulostettu = tulostettu + 1;
        }
    }
    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        int kolmio = 1;
        int tyhjat = (koko-1);
        while (kolmio <= koko) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(kolmio);
            kolmio++;
            tyhjat--;
        }
    }
    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int kuusi = 1;
        int tyhjat = (korkeus-1);
        while (kuusi <= korkeus) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(kuusi + (kuusi-1));
            kuusi++;
            tyhjat--;
        }   
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
    }        
    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
