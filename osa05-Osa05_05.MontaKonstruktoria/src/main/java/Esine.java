
public class Esine {

    private String nimi;
    private String sijainti;
    private int paino;

    public Esine(String nimi) {
        this.nimi = nimi;
        this.sijainti = "pientavarahylly";
        this.paino = 1;
    }
    public Esine (String nimi, String sijainti){
        this.nimi = nimi;
        this.sijainti = sijainti;
        this.paino = 1;
    }
    public Esine (String nimi, int paino) {
        this.nimi = nimi;
        this.sijainti = "varasto";
        this.paino = paino;
    }
    
    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    public String getSijainti() {
        return sijainti;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg) löytyy sijainnista " + this.sijainti;
    }
}
