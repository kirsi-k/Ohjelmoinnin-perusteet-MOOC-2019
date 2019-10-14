/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
import java.util.HashMap;

public class Velkakirja {
    private HashMap<String, Double> velkakirja;
    
    public Velkakirja(){
        this.velkakirja = new HashMap<>();
    }
    public void asetaLaina(String kenelle, double maara){
        this.velkakirja.put(kenelle, maara);
    }
    public double paljonkoVelkaa(String kuka){
        if (this.velkakirja.containsKey(kuka)) {
            return this.velkakirja.get(kuka);
        }

    return 0.0;
    }
}

