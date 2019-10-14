
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    public boolean suurempi(Asunto verrattava){
        int pintaAla = this.nelioita;
        int verrattavaPintaAla = verrattava.nelioita;
        
        if (pintaAla > verrattavaPintaAla) {
            return true;
        }
            return false;
    }
    public int hintaero(Asunto verrattava){
        int hintaero = this.asunnonhinta() - verrattava.asunnonhinta();
        if (hintaero < 0){
            hintaero = hintaero * -1;
        }
        return hintaero;
    }
    public int asunnonhinta (){
        int asunnonHinta = nelioita * neliohinta;
        return asunnonHinta;
    }
    public boolean kalliimpi(Asunto verrattava){
        if (this.asunnonhinta() > verrattava.asunnonhinta()){
            return true;
        }
        return false;
    }
}
