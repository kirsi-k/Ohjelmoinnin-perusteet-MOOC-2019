/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Henkilo {
    private String nimi;
    private int ika;
    
    public Henkilo (String nimiAlussa){
        this.ika = 0;
        this.nimi = nimiAlussa;
    }
    public void tulostaHenkilo() {
        System.out.println(nimi + ", ikä " + ika + " vuotta");
    }
    public void vanhene(){
        this.ika = this.ika + 1;
    }
    public int palautaIka(){
        return ika;
    }
}
