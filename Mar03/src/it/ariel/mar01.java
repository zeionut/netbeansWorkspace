/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ariel;

/**
 *
 * @author svilupposw
 */
public class mar01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Documento[] docs = {
          new Fattura(),
          new Fattura(),
          new Preventivo(),
          new DocumentoDiTrasporto(),
          new Ordine(),
          new Commessa(),
        };
        
        for (Documento d: docs){
            d.stampa();
        }
            
        
    }
    
}
