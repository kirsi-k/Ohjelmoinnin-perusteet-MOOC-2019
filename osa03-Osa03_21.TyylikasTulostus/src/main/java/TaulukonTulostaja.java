
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int indeksi = 0;
        while (indeksi < taulukko.length-1) {
            int luku = taulukko[indeksi];
            System.out.print(luku + ", ");
            indeksi = indeksi + 1;  
     }
        System.out.print(taulukko[taulukko.length-1]);
    }
}
