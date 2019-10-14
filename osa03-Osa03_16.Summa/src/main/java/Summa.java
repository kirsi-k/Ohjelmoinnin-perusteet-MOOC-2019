
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        System.out.println(summa(luvut));

        luvut.add(5);
        luvut.add(1);
        System.out.println(summa(luvut));
    }
    public static int summa(ArrayList<Integer> luvut) {
          int summa = 0;
          for (int luku: luvut) {
            summa = summa + luku;
    }
          return summa;
}
}
