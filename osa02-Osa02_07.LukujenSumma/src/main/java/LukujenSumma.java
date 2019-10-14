
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukujenSumma = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
        
            if (luku == 0) {
                    break;    
        }
            lukujenSumma = (lukujenSumma + luku);
    }
        System.out.println(lukujenSumma);
    }
}
