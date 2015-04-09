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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConcreteObservableB extends Observer { //the entry table
    
    private JFrame frame;
    private JTextField entry1 = new JTextField("1");
    private JTextField entry2 = new JTextField("2");
    private JTextField entry3 = new JTextField("3");
    private JTextField entry4 = new JTextField("4");
    private JButton makeGraph = new JButton("update graph");
    public State state;
    
    public ConcreteObservableB(Subject subject){
        
        this.state = new State(4);
        this.subject = subject;
        this.subject.attach(this);
        frame = new JFrame("Number Entry Frame");
        frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JPanel panel = new JPanel();
        makeGraph.setActionCommand("make");
        panel.setLayout(new GridLayout(5,1));
        panel.add(entry1);
        panel.add(entry2);
        panel.add(entry3);
        panel.add(entry4);
        panel.add(makeGraph);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        //Adding the fields to the view
        
        
    }
    
    @Override
    public void update(){
        
        this.state.setEntryValue(0, Double.parseDouble(entry1.getText()) );
        this.state.setEntryValue(1, Double.parseDouble(entry2.getText()) );
        this.state.setEntryValue(2, Double.parseDouble(entry3.getText()) );
        this.state.setEntryValue(3, Double.parseDouble(entry4.getText()) );
        
        System.out.println("updating the bar graph");
    }
    
}

