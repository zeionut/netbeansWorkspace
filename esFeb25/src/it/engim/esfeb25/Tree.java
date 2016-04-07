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
public class Tree extends Shrub {
    
    private String colorWood;
    private boolean evergreen;

    /**
     * @return the colorWood
     */
    public String getColorWood() {
        
        return colorWood;
    }

    /**
     * @param colorWood the colorWood to set
     */
    public void setColorWood(String colorWood) {
        
        this.colorWood = colorWood;
    }

    /**
     * @return the evergreen
     */
    public boolean isEvergreen() {
        
        return evergreen;
    }

    /**
     * @param evergreen the evergreen to set
     */
    public void setEvergreen(boolean evergreen) {
        
        this.evergreen = evergreen;
    }
    
}
