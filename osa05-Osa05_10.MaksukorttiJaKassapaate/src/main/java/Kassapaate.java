
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        double edullinen = 2.50;
        double vaihtoraha = maksu - edullinen;
        if (maksu < edullinen){
            return maksu;
        }
        this.rahaa = this.rahaa + edullinen;
        edulliset++;
        return vaihtoraha;
    }

    public double syoMaukkaasti(double maksu) {
        double maukas = 4.30;
        double vaihtoraha = maksu - maukas;
        if (maksu < maukas){
            return maksu;
        }
        this.rahaa = this.rahaa + maukas;
        maukkaat++;
        return vaihtoraha;
    }
    public boolean syoEdullisesti(Maksukortti kortti) {
        double edullinen = 2.50;
        if (kortti.saldo() >= edullinen){
            kortti.otaRahaa(edullinen);
            edulliset++;
            return true;
        }
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        double maukas = 4.30;
        if (kortti.saldo() >= maukas){
            kortti.otaRahaa(maukas);
            maukkaat++;
            return true;
        } 
        return false;
    }
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0){
            kortti.lataaRahaa(summa);
            this.rahaa = this.rahaa + summa;
        }
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
