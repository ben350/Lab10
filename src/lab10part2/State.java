/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10part2;

/**
 *
 * @author benjamin.ramirez006
 */
public class State {
    
    //this will be the class that holds the values that we will be changing.
    
    private int numEntries;
    private double[] entries;
    
    State(int numEntries){
        
        this.numEntries = numEntries;
        this.entries = new double[numEntries];
    }
    
    public void setEntryValue(int index, double entryVal){
        
        this.entries[index] = entryVal;
        System.out.println("Setting out the value of index" + index + "to "+ entryVal);
    }
    
    public double[] getEntries(){
        return this.entries;
    }
    
        
}
