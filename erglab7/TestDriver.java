/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab7
 */

import javax.swing.JFrame;

public class TestDriver {
    
    public static void main(String[] args) 
    {
        // construct namePlaque
        NamePlaque namePlaque = new NamePlaque();
        // set Default Close Operation type
        namePlaque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        // set location 
        namePlaque.setLocation(600, 400);
        // set size
        namePlaque.setSize(400,180);
        // make it visible
        namePlaque.setVisible(true);
        
    }// end main method
}// end TestDriver Class
