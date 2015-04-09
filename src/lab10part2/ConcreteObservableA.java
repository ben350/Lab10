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
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ConcreteObservableA extends Observer {//the class that holds the graph
    
    
    private JFrame frame;
    private JTextField entry1 = new JTextField("");
    private JTextField entry2 = new JTextField("");
    private JTextField entry3 = new JTextField("");
    private JTextField entry4 = new JTextField("");
    public State state;
    
    
    public ConcreteObservableA(Subject subject){
        this.state = new State(4);
        this.subject = subject;
        this.subject.attach(this);
        this.frame = new JFrame("Number Entry Frame");
        frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));
        panel.add(entry1);
        panel.add(entry2);
        panel.add(entry3);
        panel.add(entry4);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void update(){
        String barString = "";
        for (int i = 0; i < (int)this.subject.getState().getEntries()[0] ; i++){
            barString += "*";
        }
        this.entry1.setText(barString);
        
        System.out.println("updating the bar graph");
    }
    
}
