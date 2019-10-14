/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Kuutio {
    private int pituus;
    
    public Kuutio(int sarmanPituus){
        this.pituus = sarmanPituus;
    }
    public int tilavuus(){
        int tilavuus = this.pituus * this.pituus * this.pituus;
        return tilavuus;
    }
    public String toString(){
        return "Kuution särmän pituus on " + this.pituus + ", tilavuus on " + tilavuus();
    }
}
