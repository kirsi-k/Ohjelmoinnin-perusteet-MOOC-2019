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
import java.util.ArrayList;

public class Kellari {
   private HashMap<String, ArrayList<String>> kellari; 
   private ArrayList komerot;
   
   public Kellari() {
       this.kellari = new HashMap<>();
   }
   public void lisaa(String komero, String tavara){
        this.kellari.putIfAbsent(komero, new ArrayList<>());
        this.kellari.get(komero).add(tavara);
   }
   public ArrayList<String> sisalto(String komero){
       return kellari.getOrDefault(komero, new ArrayList<>());
   }
   public void poista(String komero, String tavara){
        int i = 0;
        int max = kellari.get(komero).size();
        while (i <= max) {
            if (kellari.get(komero).get(i).equals(tavara)) {
                kellari.get(komero).remove(tavara);
                break;
            }
            i++;
        }
        if (kellari.get(komero).isEmpty()) {
            kellari.remove(komero);
        }
   }
   public ArrayList<String> komerot(){
       ArrayList<String> komerolista = new ArrayList<>();
       for (String komero : this.kellari.keySet()) {
           if (this.kellari.get(komero).size() > 0) {
               komerolista.add(komero);
           }
       }
       return komerolista;
   }
}
