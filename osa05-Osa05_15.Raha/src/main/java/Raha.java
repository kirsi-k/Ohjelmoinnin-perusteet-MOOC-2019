
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    public Raha plus(Raha lisattava) {
        int eurot = this.euroa + lisattava.eurot();
        int sentit = this.senttia + lisattava.sentit();

        if (sentit > 99) {
            sentit = sentit - 100;
            eurot = eurot + 1;
        }

        return new Raha(eurot, sentit);
    }
    public boolean vahemman(Raha verrattava) {
        return (100 * this.euroa + this.senttia) < (100 * verrattava.eurot() + verrattava.sentit());
    }
    public Raha miinus(Raha vahennettava) {
        int eurot = this.euroa - vahennettava.eurot();
        int sentit = this.senttia - vahennettava.sentit();

        if (sentit < 0) {
            sentit = sentit + 100;
            eurot = eurot - 1;
        }

        if (eurot < 0) {
            return new Raha(0, 0);
        }

        return new Raha(eurot, sentit);
}
}
