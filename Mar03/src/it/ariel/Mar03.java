/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ariel;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author svilupposw
 */
public class Mar03 {

    public static void ordina(int[] arr)
    {
        boolean inOrdine = false;
        while (!inOrdine){
        
        inOrdine=true;    
        for (int i = 0; i < (arr.length-1); i++){
        
        if (arr[i] > arr[i + 1]){
        
        int tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = tmp;
        inOrdine = false;
        }
        
        
        }
        }
    }    
    public static void ordina(Documento[] arr)
    {
        boolean inOrdine = false;
        while (!inOrdine){
        
        inOrdine=true;    
        for (int i = 0; i < (arr.length-1); i++){
        
        Date dataDoc1 = arr[i].getData();
        Date dataDoc2 = arr[i+1].getData();
        int test = dataDoc1.compareTo(dataDoc2);
        
        if (test > 0){
        
        Documento tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = tmp;
        inOrdine = false;
        }
        
        
        }
        }    
    }        
    
    public static void ordina(Object[] arr, Confrontabile c)
    {
        boolean inOrdine = false;
        while (!inOrdine){
        
            inOrdine=true;   

            for (int i = 0; i < (arr.length-1); i++) {

               if (c.confronta(arr[i], arr[i + 1])>0) {

                    Object tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = tmp;
                    inOrdine = false;

                }


            }
            
        }    
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] temperature = {
        17, 15, 8, 13, 22, 26, 21        
        };
   
        ordina(temperature);
        
        
        System.out.println(Arrays.toString(temperature));
        
       Object[] docs={
            
            new Fattura(),
            new Ordine(),
            new Preventivo(),
        };
       
      /* CriterioPerNumero cpn= new CriterioPerNumero();
       ordina(docs, cpn ); è la stessa cosa che ho sotto in modo più lungo*/
       
       ordina(docs, new Confrontabile() {
           
            @Override
            public int confronta(Object o1, Object o2) {
            Documento d1 = (Documento)o1;
            Documento d2 = (Documento)o2;
            return d1.getNumero() - d2.getNumero();
            
            }
            
        });
       
       for (Object d: docs)
           ((Documento)d).stampa();
    }
    
}
