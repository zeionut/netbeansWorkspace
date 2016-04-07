/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.engim.esfeb25;

/**
 *
 * @author svilupposw
 */
public class EsFeb25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vegetable pino = new Vegetable();
        pino.setName("pino");
        
        Seaweed nori = new Seaweed();
        nori.setName("nori");
        nori.setColorSeaweed("nero");
        nori.setEdible(true);
        nori.stampSeaweed();       
        
    }
    
}
