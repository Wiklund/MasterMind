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
public enum MasterMindColor {
    /**
     * The master mind colors
     */
    BLACK("black"), BLUE("blue"), RED("red"), PURPLE("purple"), ORANGE("orange"), GREEN("green"), YELLOW("yellow"), PINK("pink");
    private String value;

    private MasterMindColor(String color){
        this.value = color;
    }
    public String getValue() {
        return value;
    }
    
    
}
