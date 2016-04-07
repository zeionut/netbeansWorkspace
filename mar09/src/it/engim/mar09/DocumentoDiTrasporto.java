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
public class DocumentoDiTrasporto extends Documento {
    
    private int numeroDocumento;
    private String vettore;

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getVettore() {
        return vettore;
    }

    public void setVettore(String vettore) {
        this.vettore = vettore;
    }
    
    
    
    @Override
    public void stampa() {
        System.out.println("DocumentoDiTrasporto");
    }
    
}
