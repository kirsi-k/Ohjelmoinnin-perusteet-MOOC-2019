
public class Paaohjelma {

    public static void main(String[] args) {
        //Scanner lukija = new Scanner(System.in);
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        
    }
}

