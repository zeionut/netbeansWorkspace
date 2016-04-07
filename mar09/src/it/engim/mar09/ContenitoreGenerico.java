/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.mar09;

/**
 *
 * @author svilupposw
 */
public class ContenitoreGenerico<GENERIC extends Documento>{
    
    private GENERIC contenuto;

    public void setContenuto(GENERIC contenuto) {
        this.contenuto = contenuto;
    }

    public GENERIC getContenuto() {
        return contenuto;
    }
    
    
}
