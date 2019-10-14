
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        int indeksi = 0;
        while (indeksi < luvut.size()) {
            int luku = luvut.get(indeksi);
            System.out.println(luku);
            indeksi = indeksi + 1;
    }
}
}