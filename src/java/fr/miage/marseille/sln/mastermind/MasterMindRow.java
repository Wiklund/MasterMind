/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.miage.marseille.sln.mastermind;


/**
 *
 * @author l11626937
 */
public class MasterMindRow {
    /**
     * The max of cells in row
     */
    private static final short MAX_INDEX = 4;
    /**
     * The cells
     */
    private MasterMindCell[] cells = new MasterMindCell[MasterMindRow.MAX_INDEX];

    public MasterMindCell getCell(short index) throws IllegalArgumentException{
        if(MasterMindRow.MAX_INDEX-1 < index){
            new IllegalArgumentException(index + " greather than the max index " + (MasterMindRow.MAX_INDEX - 1));
        }
        return cells[index];
    }
    
    public short falseValueCount(){
        short count = 0;
        for(MasterMindCell cell : cells){
            if (cell.isFalse()){
                count++;
            }
        }
        return count;
    }
}
