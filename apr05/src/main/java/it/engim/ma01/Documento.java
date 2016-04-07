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
public abstract class Documento {
    
    private int numero;
    private Date data;
    private String nomeDestinatario;
    private String cognomeDestinatario;
    private String partitaIvaDestinatario;
    private String ragioneSociale;                       
    private String indirizzoDestinatario;

    public Documento(){
    
        data = new Date();
    
    }
    
    public Documento(int numero , Date data){
    
        this.numero = numero;
        this.data = data;
    
    }
    
    public int getNumero() {
        
        return numero;
        
    }

    public void setNumero(int numero) {
        
        this.numero = numero;
        
    }

    public Date getData() {
        
        return data;
        
    }

    public void setData(Date data) {
        
        this.data = data;
        
    }

    public String getNomeDestinatario() {
        
        return nomeDestinatario;
        
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        
        this.nomeDestinatario = nomeDestinatario;
        
    }

    public String getCognomeDestinatario() {
        
        return cognomeDestinatario;
        
    }

    public void setCognomeDestinatario(String cognomeDestinatario) {
        
        this.cognomeDestinatario = cognomeDestinatario;
        
    }

    public String getPartitaIvaDestinatario() {
        
        return partitaIvaDestinatario;
        
    }

    public void setPartitaIvaDestinatario(String partitaIvaDestinatario) {
        
        this.partitaIvaDestinatario = partitaIvaDestinatario;
        
    }

    public String getRagioneSociale() {
        
        return ragioneSociale;
        
    }

    public void setRagioneSociale(String ragioneSociale) {
        
        this.ragioneSociale = ragioneSociale;
        
    }

    public String getIndirizzoDestinatario() {
        
        return indirizzoDestinatario;
        
    }

    public void setIndirizzoDestinatario(String indirizzoDestinatario) {
        
        this.indirizzoDestinatario = indirizzoDestinatario;
        
    }

    public abstract void stampa(); 
    
}


