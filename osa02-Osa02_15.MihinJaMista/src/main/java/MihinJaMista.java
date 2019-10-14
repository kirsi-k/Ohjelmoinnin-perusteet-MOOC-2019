
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mihin asti?");
        int loppu = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä alkaen?");
        int alku = Integer.valueOf(lukija.nextLine());
        
        while (alku <= loppu) {
            System.out.println(alku);
            alku = alku + 1;
        }
    }
}
