
public class Kasvatuslaitos {
       private int punnituksia;

    public Kasvatuslaitos() {
        this.punnituksia = 0;
    }

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnituksia = this.punnituksia + 1;
        return henkilo.getPaino();
    }

    public void syota(Henkilo henkilo) {
        int painoAlussa = henkilo.getPaino();
        henkilo.setPaino(painoAlussa + 1);
    }

    public int punnitukset() {
        return punnituksia;
    }
}