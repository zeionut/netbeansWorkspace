/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.mar09;

import java.util.Date;

/**
 *
 * @author svilupposw
 */
public class Commessa extends Documento{
    
    private String codice;
    private Date scadenzaCommessa;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Date getScadenzaCommessa() {
        return scadenzaCommessa;
    }

    public void setScadenzaCommessa(Date scadenzaCommessa) {
        this.scadenzaCommessa = scadenzaCommessa;
    }

    
    
    @Override
    public void stampa() {
        System.out.println("Commessa");
    }
}
