
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            int luku = taulukko[indeksi];
            tulostaTahtia(luku);
            indeksi++;
        }
    }
    public static void tulostaTahtia(int maara) {
        int tulostettu = 0;
        while (tulostettu < maara) {
            System.out.print("*");
            tulostettu = tulostettu + 1;
        }
        System.out.println("");
    }
    

}
