
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int ykkosia = 0;

        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            }
            if (luku == 1) {
                ykkosia = (ykkosia + 1);
            } 
            if (luku != 0) {
                lukuja = (lukuja + 1);
            }
        }
        if (lukuja == 0) {
            System.out.println("ykkösten osuutta ei voida laskea");
        } else {
            double ykkostenOsuus = 1.0 * ykkosia / lukuja;
            System.out.println(ykkostenOsuus);
        }
    }
}