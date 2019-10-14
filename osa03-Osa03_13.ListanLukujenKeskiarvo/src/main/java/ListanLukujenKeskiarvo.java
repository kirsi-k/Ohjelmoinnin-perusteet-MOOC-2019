
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

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

        System.out.println("");
        int summa = 0;
        int indeksi = 0;
        while (indeksi < lista.size()) {
            summa += lista.get(indeksi);
            indeksi++;
        }
        System.out.println("Keskiarvo on: " + (1.0 * summa / lista.size()));
    }
}
