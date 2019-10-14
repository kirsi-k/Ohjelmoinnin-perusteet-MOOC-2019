
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti (7);

    }
    public static void tulostaLukuunAsti(int luku) {
        int i = 1;
        while (i <= luku) {
            System.out.println(i);
            i = i + 1;
        }
}
}