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
public class Seaweed extends Shrub {
    
    private String colorSeaweed;
    private boolean edible;

    /**
     * @return the colorSeaweed
     */
    public String getColorSeaweed() {
        
        return colorSeaweed;
    }

    /**
     * @param colorSeaweed the colorSeaweed to set
     */
    public void setColorSeaweed(String colorSeaweed) {
        
        this.colorSeaweed = colorSeaweed;
    }

    /**
     * @return the edible
     */
    public boolean isEdible() {
        
        return edible;
    }

    /**
     * @param edible the edible to set
     */
    public void setEdible(boolean edible) {
        
        this.edible = edible;
    }
    
    public void stampSeaweed() {
        
        System.err.println("L'alga " + getName() + ", che è di colore " +
        getColorSeaweed() + (isEdible() ? "" : " non") + " è commestibile");
        
    }
    
}
