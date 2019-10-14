/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Musiikkikappale {
    private String nimi;
    private int pituus;
    
    public Musiikkikappale (String kappaleenNimi, int kappaleenPituus) {
        this.nimi = kappaleenNimi;
        this.pituus = kappaleenPituus;
    }
    public String nimi() {
        return nimi;
    }
    public int pituus(){
        return pituus;
    }
}
