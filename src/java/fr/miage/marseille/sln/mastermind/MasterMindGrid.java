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
public class MasterMindGrid {
    /**
     * The max of row in grid
     */
    private static final short MAX_INDEX = 12;
    
    private MasterMindRow[] rows = new MasterMindRow[12];
    
    public MasterMindRow getRow(short index) throws IllegalArgumentException{
        if(MasterMindGrid.MAX_INDEX-1 < index){
            new IllegalArgumentException(index + " greather than the max index " + (MasterMindGrid.MAX_INDEX - 1));
        }
        return rows[index];
    }
}
