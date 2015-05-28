/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.marseille.sln.mastermind;

/**
 *
 * @author Stephane LOPES-NEVES
 */
public class MasterMindCell {
    /**
     * The color of the cell set by the player
     */
    private MasterMindColor playerColor;
    
    /**
     * The color to find
     */
    private MasterMindColor colorToFind;

    public MasterMindColor getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(MasterMindColor playerColor) {
        this.playerColor = playerColor;
    }

    public MasterMindColor getColorToFind() {
        return colorToFind;
    }

    public void setColorToFind(MasterMindColor colorToFind) {
        this.colorToFind = colorToFind;
    }
    
    public boolean isFalse(){
        return this.playerColor.equals(this.colorToFind);
    }
}
