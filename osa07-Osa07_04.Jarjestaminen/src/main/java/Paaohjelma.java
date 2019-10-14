import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
int[] luvut = {8, 3, 7, 9, 1, 2, 4};
Paaohjelma.jarjesta(luvut);

System.out.println(Arrays.toString(luvut));

Paaohjelma.vaihda(luvut, 1, 0);
System.out.println(Arrays.toString(luvut));

Paaohjelma.vaihda(luvut, 0, 3);
System.out.println(Arrays.toString(luvut));
    
    }
    public static int pienin(int[] taulukko) {
         int pienin = taulukko[0];

        for (int luku : taulukko) {
            if (luku < pienin) {
                pienin = luku;
            }
        }
        return pienin;
    }
    public static int pienimmanIndeksi(int[] taulukko) {
        int indeksi = 0;
        int pienin = pienin(taulukko);
        while (indeksi < taulukko.length) {
            if (taulukko[indeksi] == pienin) {
                return indeksi;
            }
            indeksi++;
        }
        return -1;
    }
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                indeksi = i;
                pienin = taulukko[i];
            }
        }
        return indeksi;
    }
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }
    public static void jarjesta(int[] taulukko) {
        int indeksi = 0;
        System.out.println(Arrays.toString(taulukko));
        for (int i = 0; i < taulukko.length; i++) {
            indeksi = pienimmanIndeksiAlkaen(taulukko, i);
            vaihda(taulukko, i, indeksi);
            System.out.println(Arrays.toString(taulukko));
        }
    }
}
