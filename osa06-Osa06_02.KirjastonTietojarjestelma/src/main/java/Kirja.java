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
    private String nimeke;
    private String julkaisija;
    private int julkaisuvuosi;
           
public Kirja(String nimeke, String julkaisija, int julkaisuvuosi){
     this.nimeke = nimeke;
     this.julkaisija = julkaisija;
     this.julkaisuvuosi = julkaisuvuosi;
}
public String nimeke(){
    return nimeke;
}
public String julkaisija(){
    return julkaisija;
}
public int julkaisuvuosi(){
    return julkaisuvuosi;
}
@Override
public String toString() {
    return this.nimeke + ", " + this.julkaisija + ", " + this.julkaisuvuosi;
    }
}
