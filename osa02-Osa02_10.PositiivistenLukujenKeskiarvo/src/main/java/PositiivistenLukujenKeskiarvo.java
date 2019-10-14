
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int lukujenSumma = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            }
            if (luku < 0 ) {
                continue;
            } 
            lukuja = lukuja + 1;
            lukujenSumma = lukujenSumma + luku;
            }
            if (lukuja == 0) {
            System.out.println("ykkösten osuutta ei voida laskea");
            } else {
            double keskiarvo = 1.0 * lukujenSumma / lukuja;
            System.out.println(keskiarvo);
            }
    }
}

