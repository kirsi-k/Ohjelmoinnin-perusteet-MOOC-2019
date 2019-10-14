
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");

        System.out.println(merkkijonot);

        poistaViimeinen(merkkijonot);
        poistaViimeinen(merkkijonot);

        System.out.println(merkkijonot);
        
    }
    public static void poistaViimeinen(ArrayList<String> merkkijonot) {
        if (merkkijonot.size() == 0) {
        return;
    }
        int indeksi = merkkijonot.size();
        merkkijonot.remove(indeksi-1);
}
}
