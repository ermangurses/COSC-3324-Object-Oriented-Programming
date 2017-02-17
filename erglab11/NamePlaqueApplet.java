
import javax.swing.JApplet;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NamePlaqueApplet extends JApplet  
{
    private JLabel labelTitle; 
    private JLabel labelFieldFirstName;
    private JLabel labelFieldMiddleInitial;
    private JLabel labelFieldLastName;
    private JLabel labelFullName;
    
    private JTextField textFieldTitle;
    private JTextField textFieldFirstName;
    private JTextField textFieldMiddleInitial;
    private JTextField textFieldLastName;
    private JTextField textFieldFullName;
    
    private String stringFieldTitle;
    private String stringFieldFirstName;
    private String stringFieldMiddleInitial;
    private String stringFieldLastName;
    private String stringFullName;
        
    public void init() 
    {
        
        
        setLayout(new GridLayout(5,2));
    
        //construct icon
        Icon tamucc = new  ImageIcon(getClass().getResource("islanders.png"));
        
        //construct labelTitle and add to layout 
        labelTitle = new JLabel("Title",tamucc,SwingConstants.LEFT);
        labelTitle.setToolTipText("Type your Title");
        add(labelTitle);
          
        //construct textFieldTitle and add to layout
        textFieldTitle = new JTextField(4);
        add(textFieldTitle);
    
        //construct labelFieldFirstName  and add to layout
        labelFieldFirstName = new JLabel("First Name",tamucc,
        SwingConstants.LEFT);
        labelFieldFirstName.setToolTipText("Type your First Name");
        add(labelFieldFirstName);
        
        //construct textFieldFirstName  and add to layout
        textFieldFirstName = new JTextField(8);
        add(textFieldFirstName);
                
        //construct labelFieldMiddleInitial  and add to layout
        labelFieldMiddleInitial= new JLabel("Middle Initial",tamucc,
        SwingConstants.LEFT);
        labelFieldMiddleInitial.setToolTipText("Type your Middle Initial");
        add(labelFieldMiddleInitial);
        
        //construct textFieldMiddleInitial and add to layout
        textFieldMiddleInitial = new JTextField(5);
        add(textFieldMiddleInitial);
         
        //construct labelFieldLastName and add to layout
        labelFieldLastName= new JLabel("Last Name",tamucc,SwingConstants.LEFT);
        labelFieldLastName.setToolTipText("Type your Last Name");
        add(labelFieldLastName); 
        
        //construct textFieldLastName and add to layout
        textFieldLastName = new JTextField(8);
        add(textFieldLastName);
        
        //construct labelFullName and add to layout
        labelFullName= new JLabel("Full Name",tamucc,SwingConstants.LEFT);
        labelFullName.setToolTipText("It shows your full name");
        add(labelFullName);
        
        
        //construct textFieldFullName and add to layout   
        textFieldFullName = new JTextField(25);
        textFieldFullName.setEditable(false);
        add(textFieldFullName);
        
      
        // Register Event Handlers
        TextFieldHandler handler = new TextFieldHandler();
        textFieldTitle.addActionListener(handler);
        textFieldFirstName.addActionListener(handler);
        textFieldMiddleInitial.addActionListener(handler);
        textFieldLastName.addActionListener(handler);
        
    }// end NamePlaque constructor
    
    // private inner class for event handling 
    private class  TextFieldHandler implements ActionListener        
    {    
        // process text field events
        public void actionPerformed (ActionEvent event)
        {     
            // check textFieldLastName 
           if(event.getSource()==textFieldLastName)
           {
               stringFieldTitle         = textFieldTitle.getText();
               stringFieldFirstName     = textFieldFirstName.getText();
               stringFieldMiddleInitial = textFieldMiddleInitial.getText();
               stringFieldLastName      = textFieldLastName.getText();
                         
               // concatinate string variables
               stringFullName = stringFieldTitle+" "+stringFieldFirstName
                                +" "+stringFieldMiddleInitial
                                +" "+stringFieldLastName;
               
               // set textFieldFullName by stringFullName
               textFieldFullName.setText(stringFullName);                            
           } // end if       
        } // end method actionPerformed
    }// end private inner class TextFieldHandler       
}// end  public NamePlaque class
   



