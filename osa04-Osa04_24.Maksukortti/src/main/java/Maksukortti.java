/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */

 public class Maksukortti {

    private double arvo;
    private final double edullinen;
    private final double maukas;

    public Maksukortti(double arvoaAlussa) {
        this.arvo = arvoaAlussa;
        this.edullinen = 2.6;
        this.maukas = 4.6;
    }

    public void syoEdullisesti() {
        if (this.arvo >= edullinen) {
            this.arvo -= edullinen;
        }
    }

    public void syoMaukkaasti() {
        if (this.arvo >= maukas) {
            this.arvo -= maukas;
        }
    }

    public void lataaRahaa(double rahamaara) {
        if (rahamaara < 0) {
            return;
        }

        this.arvo += rahamaara;
        if (this.arvo > 150) {
            this.arvo = 150;
        }
    }

    @Override
    public String toString() {
        return "Kortilla on rahaa " + this.arvo + " euroa";
    }
}
