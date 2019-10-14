/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Kirja {
    private String nimi;
    private int sivuja;
    private int vuosi;
    
    public Kirja (String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }
    public String getNimi() {
        return this.nimi;
    }
    public int getSivuja() {
        return this.sivuja;
    }
    public int getVuosi(){
        return this.vuosi;
    }
    @Override
    public String toString(){
        return this.nimi + ", " + this.sivuja + " sivua, " + this.vuosi;
    }
}
