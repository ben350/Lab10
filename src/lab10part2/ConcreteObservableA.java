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
import java.awt.event.*;
public class ConcreteObservableA extends Observer {
    
    public ConcreteObservableA(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update(){
        System.out.println("updating the bar graph");
    }
    
}
