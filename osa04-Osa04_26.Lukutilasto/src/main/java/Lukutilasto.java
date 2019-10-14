
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }
    public void lisaaLuku(int luku) {
        this.lukujenMaara = this.lukujenMaara + 1;
        this.summa = this.summa + luku;
    }
    public int haeLukujenMaara() {
       return lukujenMaara;
    }
    public int summa(){
        return summa;
    }
    public double keskiarvo(){
        double keskiarvo = 0;
        if (lukujenMaara > 0){
           keskiarvo = 1.0 * summa / lukujenMaara;
        }
        return keskiarvo;
    }
}