/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lahjat;
    
    public Pakkaus(){
        this.lahjat = new ArrayList<>();
    }
    public void lisaaLahja(Lahja lahja){
        lahjat.add(lahja);
    }
    public int yhteispaino(){
        int pakkauksenPaino = 0;
        for (Lahja lisatty: lahjat){
            pakkauksenPaino = pakkauksenPaino + lisatty.getPaino();
        }
        return pakkauksenPaino;
    }
}
