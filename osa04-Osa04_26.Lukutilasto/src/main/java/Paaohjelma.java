
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
         Lukutilasto tilasto = new Lukutilasto();
         Lukutilasto parilliset = new Lukutilasto();
         Lukutilasto parittomat = new Lukutilasto();
        
        System.out.println("Anna lukuja:");
         while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }
            tilasto.lisaaLuku(luettu);
            
            if (luettu % 2 == 0) {
                parilliset.lisaaLuku(luettu);
            } else {
                parittomat.lisaaLuku(luettu);
            }
         }
     System.out.println("Summa: " + tilasto.summa());
     System.out.println("Parillisten summa: " + parilliset.summa());
     System.out.println("Parittomien summa: " + parittomat.summa());
}
    }

