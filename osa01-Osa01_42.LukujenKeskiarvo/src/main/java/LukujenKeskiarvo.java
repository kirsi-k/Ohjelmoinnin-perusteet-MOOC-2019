
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;
        int lukujenSumma = 0;
        double lukujenKa = 0;
        
        while (true){
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 0) {
                break;
            }     
            if (0 != luku) {
                lukuja = (lukuja + 1);
            }
            if (0 != luku) {
                lukujenSumma = (lukujenSumma + luku );
            }
            if (0 != luku) {
                lukujenKa = (double)lukujenSumma /lukuja;
            }
        }
        System.out.println("Lukujen keskiarvo " + lukujenKa);   
    }
   
    }
