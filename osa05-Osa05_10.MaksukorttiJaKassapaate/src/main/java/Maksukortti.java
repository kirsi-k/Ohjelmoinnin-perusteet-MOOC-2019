/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Maksukortti {
    private double saldo;

    public Maksukortti(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return this.saldo;
    }

    public void lataaRahaa(double lisays) {
        if (lisays > 0) {
        this.saldo += lisays;
        }
    }

    public boolean otaRahaa(double maara) {
        if (saldo >= maara){
            saldo = saldo - maara;
            return true;
        }
        return false;
    }
}

