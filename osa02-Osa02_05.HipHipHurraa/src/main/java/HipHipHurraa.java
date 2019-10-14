
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String teksti =lukija.nextLine();
        
            if (teksti.equals("lopeta")) {
                break;
        }
            System.out.println("hip!");
        }
        System.out.println("hurraa!"); }
    
}