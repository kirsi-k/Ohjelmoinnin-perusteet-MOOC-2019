
import java.util.ArrayList;

public class MaPu {
    private int luku;
    
   public MaPu(){
       this.luku = 0;
   }
   public static double keskiarvo(ArrayList<Integer> luvut){
      int lukujenSumma = 0;
      int lukujenMaara = 0;

      for(int luku: luvut) {
         lukujenMaara++;
         lukujenSumma = lukujenSumma + luku;
        }
      double keskiarvo = 1.0 * lukujenSumma / lukujenMaara;
      return keskiarvo;
    }
   }

