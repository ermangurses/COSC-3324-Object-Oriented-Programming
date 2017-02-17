/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab8
 */


import javax.swing.JFrame;

public class ColorComboBoxTest 
{

    
    public static void main(String[] args) 
    {
       // Create an ColorComboBox object and reference variable points it.
       ColorComboBox colorComboBox = new ColorComboBox();
       
       // Set the close operation
       colorComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // Set the size of colorComboBox object 
       colorComboBox.setSize(400, 200);
       
       // Set the location of colorComboBox object
       colorComboBox.setLocation(800, 400);
       
       // Set the colorComboBox object visible on the screen
       colorComboBox.setVisible(true);
          
    }
}
