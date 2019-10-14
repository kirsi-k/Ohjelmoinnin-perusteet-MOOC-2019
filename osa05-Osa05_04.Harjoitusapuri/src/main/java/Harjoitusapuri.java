/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Harjoitusapuri {
    private int leposyke;
    private int ika;
    
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;
    }
    public double tavoitesyke(double prosenttiaMaksimista){
        double maksimisyke = 206.3 - (0.711 * this.ika);
        double tavoitesyke = ((maksimisyke-this.leposyke) * (prosenttiaMaksimista) + this.leposyke);
        return tavoitesyke;
    }
}
