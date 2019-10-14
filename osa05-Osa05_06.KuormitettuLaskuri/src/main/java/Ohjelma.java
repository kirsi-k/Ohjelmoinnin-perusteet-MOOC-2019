
public class Ohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Laskuri laskuri = new Laskuri();
        laskuri.lisaa(10);
        laskuri.lisaa(-1);
        laskuri.vahenna(2);
        laskuri.vahenna();
        System.out.println(laskuri.arvo());
    }
}
