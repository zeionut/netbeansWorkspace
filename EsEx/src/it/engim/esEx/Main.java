/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.esEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author svilupposw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
            openFile();
            
        }
        
        catch(FileNotFoundException fnfe) {
            
            System.err.println("File non trovato");
            fnfe.printStackTrace();
            
        }
        
        catch(IOException ioe) {
            
            System.err.println("File non leggibile");
            ioe.printStackTrace();
            
        }
            
        finally {

            System.out.println("Fatto tutto!");
    
        }
        
        System.out.println("Se va tutto bene arrivo io!");
        
    }
    
    public static void openFile()  throws IOException {
            
        File file = new File("/etc/passwd");
            
        InputStream is = new FileInputStream(file);
            
        is.close();   
            
    }
    
}
