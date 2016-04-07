/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.mar09;

import java.util.ArrayList;

/**
 *
 * @author svilupposw
 */
public class Mar09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContenitoreGenerico <Fattura> cg = new ContenitoreGenerico<>();
        
        ArrayList <String> rubrica = new ArrayList<>();
        
        ArrayList <Integer> temperature = new ArrayList<>();
        
        ArrayList <Documento> docs = new ArrayList<>();
        
        rubrica.add("Filippo Cocchia 3200746324");
        
        temperature.add(75);
        temperature.add(35);
        temperature.add(80);
        
        docs.add(new Fattura());
        
        //String voceInRubrica = (String) rubrica.get(0);
        String voceInRubrica = rubrica.get(0);
        
        int temp = temperature.get(0);
        
        for (int t: temperature)
            System.out.println(t);
        
        Fattura voce = cg.getContenuto();
        
        Class <? extends Documento> descriviOrdine = Ordine.class;
        
    }
    
}
