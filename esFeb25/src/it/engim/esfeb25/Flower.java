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
public class Flower extends Shrub {
    
    private String colorPetal;
    private int numberPetal;

    /**
     * @return the colorPetal
     */
    public String getColorPetal() {
        
        return colorPetal;
    }

    /**
     * @param colorPetal the colorPetal to set
     */
    public void setColorPetal(String colorPetal) {
        
        this.colorPetal = colorPetal;
    }

    /**
     * @return the numberPetal
     */
    public int getNumberPetal() {
        
        return numberPetal;
    }

    /**
     * @param numberPetal the numberPetal to set
     */
    public void setNumberPetal(int numberPetal) {
        
        this.numberPetal = numberPetal;
    }
    
}
