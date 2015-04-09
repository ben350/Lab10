/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10part2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author benjamin.ramirez006
 */
public class Lab10Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Using the Observer pattern to solve the task
        
        Subject subject = new Subject();
        new ConcreteObservableB(subject);
        
        
    }
    
}
