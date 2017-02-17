/**
 *      Erman Gurses
 *      COSC 3324
 *      A03539870
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;     //static method createTitledBorder()
import java.awt.event.ActionListener; //JButton, JTextArea, JMenuItem
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;   //JRadioButton, JCheckBox
import java.awt.event.ItemEvent;
import javax.swing.*;


public class OnlineOrder extends  JFrame implements ActionListener, ItemListener
{
    public static final int SEATINGAREAS = 4;
    public static final int NPAYMENTCHOICES = 5;

    private JPanel centerPanel     =   new JPanel();
    private JPanel seatingPanel    =   new JPanel();
    private JPanel paymentPanel    =   new JPanel();
    private JPanel buttonPanel     =   new JPanel();
    private JPanel concertPanel    =   new JPanel();

    private JTextArea display = new JTextArea(10,30); //10 rows, 30 char
    private JButton   submit  = new JButton("Submit Order");
    private JButton   cancel  = new JButton("Cancel");

    private JCheckBox seatsCheckBox[] = new JCheckBox[SEATINGAREAS];
    private String seatsString[] = {"Orchestra     -   $100.00",
                                    "Ground Floor   -   $75.00",
                                    "Balcony            -   $50.00",
                                    "Standing           -  $30.00"};
    
    private double prices[]={100.00,75.00,50.00,30.00};
    
    private JTextField seatingTextField[] = new JTextField[SEATINGAREAS];
    

    private JRadioButton paymentOption[] = new JRadioButton[NPAYMENTCHOICES];
    private String paymentString[] = {"Credit Card",
                                      "Debit Card",
                                      "E-Cash",
                                      "Pay Pal",
                                      "Overnight Express Mail"};
	
    private String concertNames[]= {"Willie Nelson","Reba","Cher","BJ's",
				    "Mark Knopfler","Chuck Berry",
				    "Blues Brothers","Metallica",
                                    "Mor ve Otesi"};
									
    private JComboBox  concertNamesComboBox = new JComboBox(concertNames);
    
    private JScrollPane scrolledText = new JScrollPane(display);
	
    //radioButtons must be added to a ButtonGroup in order 
    //  to enforce mutual exclusion among them
    private ButtonGroup paymentGroup = new ButtonGroup();

    private double subTotal=0;
    private double total=0;
    
    public OnlineOrder( )               //constructor
    {
        super("Super Concert Center");
        setLayout(new GridLayout(3,1));

        //setBackground for text area
        display.setBackground(Color.LIGHT_GRAY);
       
        
        scrolledText.setHorizontalScrollBarPolicy(
                     JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         
        scrolledText.setVerticalScrollBarPolicy(
                     JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
       
        
        concertPanel.setLayout(new FlowLayout());
	concertNamesComboBox.setMaximumRowCount(8);
	concertPanel.setBorder(BorderFactory.createTitledBorder(
				"Concert Names:"));						   
        concertPanel.setBackground(Color.CYAN);
        concertNamesComboBox.addItemListener(this);		
	concertPanel.add(concertNamesComboBox);
	
		
		
        //initialize itemPanel()   
        //    createTitledBorder(..) is a static method in 
        //    class BorderFactory 
        seatingPanel.setBorder(BorderFactory.createTitledBorder
                                         ("Seating Areas:"));
        seatingPanel.setLayout(new GridLayout(4,2));  //NITEMS
        seatingPanel.setBackground(Color.PINK);
               
        
        for (int i = 0; i < seatsCheckBox.length; i++)
        {  
           
           seatsCheckBox[i] = new JCheckBox(seatsString[i]);
           seatsCheckBox[i].addItemListener(this);
           seatingTextField[i] = new JTextField();
           seatingTextField[i].addActionListener(this);
           seatingPanel.add(seatsCheckBox[i]);
           seatingPanel.add(seatingTextField[i]);
        }
          
        
        //initialize paymentPanel
        paymentPanel.setBorder(BorderFactory.createTitledBorder
                                          ("Payment by:"));
        paymentPanel.setLayout(new GridLayout(5,1)); //NPAYMENTCHOICES
        paymentPanel.setBackground(Color.GREEN);
        for (int k = 0; k < paymentOption.length; k++)
        {  paymentOption[k] = new JRadioButton(paymentString[k]);
           paymentOption[k].addItemListener(this);
           paymentPanel.add(paymentOption[k]);
           paymentGroup.add(paymentOption[k]); //enforce mutual exclusion
        }
        paymentOption[0].setSelected(true); //select the 1st JRadioButton

        
        //initialize centerPanel
        centerPanel.setLayout(new GridLayout(1,3));
	centerPanel.add(concertPanel);
        centerPanel.add(seatingPanel);
        centerPanel.add(paymentPanel);
		

        //initialize buttonPanel
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.YELLOW);
        cancel.addActionListener(this);
        submit.addActionListener(this);
        buttonPanel.add(cancel);
        buttonPanel.add(submit);

        //complete this JFrame object
        display.setEditable(false);
        
        add(scrolledText);
        add(centerPanel);
        add(buttonPanel);
    }//OnlineOrder constructor

    //JButtons, JTextAreas, JMenuItems
    public void actionPerformed(ActionEvent e)
    {
        String buttonString = e.getActionCommand( );
        if (buttonString.equals("Submit Order"))
        {  display.append("\nThank you.\n");
           display.append("Press 'Confirm' to submit your order.");
           submit.setText("Confirm Order");
        }
        else
          if (buttonString.equals("Confirm Order"))
          {  display.append("\nThank you.\n");
             display.append("You will receive your order tomorrow.");
             submit.setText("Submit Order");
          }
          else
            if (buttonString.equals("Cancel"))
            {  display.setText("Thank you.\n");
               display.append("Please visit our site again.");
            }
            else
               JOptionPane.showMessageDialog(null,"Unexpected error.");
       
        
    }//actionPerformed()

    //JRadioButtons, JCheckBoxes
    public void itemStateChanged(ItemEvent e)
    {
         
        
        display.setText("Your order so far (Payment by: ");
        for (int i = 0; i < paymentOption.length; i++)
            if(paymentOption[i].isSelected())  
                display.append(paymentOption[i].getText() + ")\n");
        
        
          display.append(concertNames[concertNamesComboBox.getSelectedIndex()]);
                   
   
        
          
        for (int i = 0; i < seatsCheckBox.length; i++)
            if(seatsCheckBox[i].isSelected())
            {
                
             
              subTotal = Integer.parseInt( seatingTextField[i].getText()) 
                         * prices[i];
              
               total+=subTotal; 
              
                //seatingTextField[]
                display.append("\n" + seatsCheckBox[i].getText()+ 
                        " per a seat; "+ seatingTextField[i].getText()+     
                        " seat selected. Total price for this seating area" +
                        " is $"+ subTotal+"0");
                           
            }
        
        display.append("\nTotal Price is: $"+total+"0" );
        
        total=0;
    }//itemStateChanged
}
