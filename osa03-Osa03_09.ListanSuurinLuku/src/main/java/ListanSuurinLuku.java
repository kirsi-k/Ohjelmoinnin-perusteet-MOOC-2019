
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        int suurin = lista.get(0);

        int indeksi = 0;
            while (indeksi < lista.size()) {
            int luku = lista.get(indeksi);
            if (suurin < luku) {
                suurin = luku;
    }
    indeksi = indeksi + 1;
    }
        System.out.println("Listan suurin luku: " + suurin);

        // toteuta listan suurimman luvun selvittäminen tänne
    }
}
