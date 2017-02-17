/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab8
 */


import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ColorComboBox  extends JFrame
{
    private JComboBox myComboBox;
    private JLabel myLabel;
    private JTextField myTextField;
    
    // It is a String array. These strings will be shown on the JLabel
    private static final String[] colorNames = {"RED","GREEN","BLUE",
        "YELLOW","ORANGE","LIGHT_GRAY","DARK_GRAY","MAGENTA","CYAN","PINK"};
    
    // It is a String array. These strings will be shown on the JComboBox
    private static final String [] colorText = {"RED Display","GREEN Display",
        "BLUE Display", "YELLOW Display","ORANGE Display","LIGHT_GRAY Display",
        "DARK_GRAY Display","MAGENTA Display","CYAN Display","PINK Display"};
  
    // It is a Color array. These colors will be shown in the JTextField
    private Color [] colors = {Color.RED,Color.GREEN, Color.BLUE, Color.YELLOW,
         Color.ORANGE, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.MAGENTA, 
         Color.CYAN, Color.PINK};
    
    // constructor
    public ColorComboBox()
    {
       // super class's constructor 
       super("Erman's ComboBox");
       
       // set Layout as a FlowLayout
       setLayout(new FlowLayout());
            
       // create an JComboBox object myComboBox reference variable points it
       //This object gets string array(colorNames) as a variable 
       myComboBox =  new JComboBox(colorNames);
       
       //Set the JComboBox to display 6 colors
       myComboBox.setMaximumRowCount(6);
    
       // create an JTextField object. myTextField  reference variable points
       // it and set the space 12 characters for JTextField
       myTextField = new JTextField(12);
        
       // create an JLabel object. myLabel  reference variable points it.
       myLabel = new JLabel();
        
       
       // 
       myComboBox.addItemListener
       (      
          // anonymous inner class     
          new ItemListener()
          {
              // handle JComboBox event
             public void itemStateChanged(ItemEvent event)
             {
                // determine whether item selected
               if(event.getStateChange()==ItemEvent.SELECTED)
               {
                    // set the text for the myLabel regarding  which item 
                    // selected from  myComboBox
                    myLabel.setText(colorText[myComboBox.getSelectedIndex()]);
                    
                    // set the color regarding which item selected from 
                    // myComboBox
                    myTextField.setBackground(colors[myComboBox.getSelectedIndex()]);
                    
               }//  end if 
                      
             }//  end  method itemStateChanges()
        
          }// end anonymous ItemListener()
                     
       );//  end call to addItemListener()
        
       // default setText
       myLabel.setText(colorText[myComboBox.getSelectedIndex()]);
                   
       // default setBackground
       myTextField.setBackground(colors[myComboBox.getSelectedIndex()]);
        
       add(myComboBox);// add comboBox to JFrame
       add(myTextField); // add JTextField to JFrame
       add(myLabel); // add JLabel to JFrame
        
       
    }// end  ColorComboBox constructor
    
}// end class ColorComboBox
