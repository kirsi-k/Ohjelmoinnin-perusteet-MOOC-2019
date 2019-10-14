/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Velka {
    private double saldo;
    private double korkokerroin;
    
    public Velka (double saldoAlussa, double korkokerroinAlussa){
        this.saldo = saldoAlussa;
        this.korkokerroin = korkokerroinAlussa;
    }
    public void tulostaSaldo(){
        System.out.println(saldo);
    }
    public void odotaVuosi(){
        saldo = saldo * korkokerroin;
    }
}
