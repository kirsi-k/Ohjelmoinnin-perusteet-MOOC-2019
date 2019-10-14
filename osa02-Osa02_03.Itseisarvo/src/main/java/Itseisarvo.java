
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku < 0) {
            System.out.println(luku * -1);
        }
        else if (luku > 0) {
            System.out.println(luku);
        }
    }
}
