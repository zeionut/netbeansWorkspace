/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.ma01;

import java.util.Date;

/**
 *
 * @author svilupposw
 */
public class Fattura extends Documento {
    
    private Date scadenza;
    private float totale;

    public Fattura() {
        
        super();
        
    } 
    
    public Date getScadenza() {
        
        return scadenza;
        
    }

    public void setScadenza(Date scadenza) {
        
        this.scadenza = scadenza;
        
    }

    public float getTotale() {
        
        return totale;
        
    }

    public void setTotale(float totale) {
        
        this.totale = totale;
        
    }

    @Override
    public void stampa() {
        
        System.out.println("Fattura");
        
    }
    
}
