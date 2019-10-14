/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int havainnot;
    
    public Lintu (String nimi, String latinaNimi, int havainnot){
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
        this.havainnot = havainnot;
    }
    public String getNimi(){
        return this.nimi;
    }
    public String getLatinaNimi(){
        return this.latinaNimi;
    }
    public int getHavainnot(){
        return this.havainnot;
    }
    public void setHavainnot(int havainnot){
        this.havainnot = havainnot;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.latinaNimi + "): " + this.havainnot + " havaintoa";
    }
}
