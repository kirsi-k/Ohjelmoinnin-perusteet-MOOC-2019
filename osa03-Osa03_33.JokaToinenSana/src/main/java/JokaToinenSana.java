
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
        
        String[] osat = luettu.split(" ");
        int indeksi = 0;
        while (indeksi < osat.length-1){
            indeksi++;
        if (indeksi % 2 != 0) {
            System.out.println(osat[indeksi]);
        }
        }
    }
}
}
