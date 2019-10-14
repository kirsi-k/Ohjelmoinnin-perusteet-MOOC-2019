import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        ArrayList<String> luvut = new ArrayList<>();
        luvut.add("kahdeksan");
        luvut.add("kolme");
        luvut.add("seitsemän");
        System.out.println(luvut);
        jarjestaMerkkijonot(luvut);
        System.out.println(luvut);

    }
    public static void jarjesta(int[] taulukko){
        Arrays.sort(taulukko);
    }
    public static void jarjesta(String[] taulukko){
        Arrays.sort(taulukko);
    }
    public static void jarjestaLuvut(ArrayList<Integer> luvut){
        Collections.sort(luvut);
    }
    public static void jarjestaMerkkijonot(ArrayList<String> luvut){
        Collections.sort(luvut);
    }
}
