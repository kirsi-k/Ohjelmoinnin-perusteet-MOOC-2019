
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        
        Tili artonTili = new Tili("Arton tili", 100.00);
        
        artonTili.pano(20);
        
        System.out.println("Arton tilin saldo on: " + artonTili.saldo());
    }
}
