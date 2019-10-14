
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        int indeksi = 0;
        while (indeksi < lista.size()) {
        indeksi = indeksi + 1;
    }
        System.out.println(lista.get(0));
        System.out.println(lista.get(indeksi-1));
}
}