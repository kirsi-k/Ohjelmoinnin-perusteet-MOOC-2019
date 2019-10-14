
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

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

        // toteuta listan lukujen summan laskeminen tänne
        int summa = 0;
        int indeksi = 0;
        while (indeksi < lista.size()) {
            summa += lista.get(indeksi);
            indeksi++;
        }
        System.out.println("Summa: " + summa);
            
        }
        }
    

