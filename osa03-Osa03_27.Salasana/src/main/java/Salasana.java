
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana";
        
         while (true) {
            System.out.print("Anna salasana: ");
            String syote = lukija.nextLine();
            
            if(syote.equals(salasana)) {
                System.out.println("Oikein!");
                System.out.println("Salaisuus on: Huomenna on perjantai");
                break;
            } else {
                System.out.println("Väärin!");
            }
         }
           
        }

}

