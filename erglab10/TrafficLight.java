/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab10
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TrafficLight extends JFrame 
                        implements ActionListener, ItemListener
{
    
    public JRadioButton Horizontal;
    public JRadioButton Vertical;
    public ButtonGroup radioGroup;
    
    public static final int LIGHT_DIAMETER = 50;
    public static final int EDGE = 5;

    //horizontal light
    public static final int HX_START = 40;
    public static final int HY_START = 220;

    public static final int HX_RED = HX_START + EDGE;
    public static final int HY_RED = HY_START + EDGE;

    public static final int HX_YELLOW = HX_START + 2*EDGE + LIGHT_DIAMETER ;
    public static final int HY_YELLOW = HY_START + EDGE;
    
    public static final int HX_GREEN = HX_START + 3*EDGE + 2*LIGHT_DIAMETER ;
    public static final int HY_GREEN = HY_START + EDGE;
    
    public static final int HX_ARROW = HX_START + 4*EDGE + 3*LIGHT_DIAMETER ;
    public static final int HY_ARROW = HY_START + EDGE;
    
    public static final int HLIGHT_FRAME_WIDTH  = 4*LIGHT_DIAMETER + 5*EDGE;
    public static final int HLIGHT_FRAME_HEIGHT = LIGHT_DIAMETER + 2*EDGE;

    private int[] xValuesH = { HX_ARROW+2 , HX_ARROW+17 , HX_ARROW+26, 
                               HX_ARROW+11, HX_ARROW+26 , HX_ARROW+17 };
    
    private int[] yValuesH = { HY_ARROW+25 , HY_ARROW+5 , HY_ARROW+5, 
                               HY_ARROW+25,  HY_ARROW+45, HY_ARROW+45,};
      
	//vertical light  
    public static final int VX_START = 420;
    public static final int VY_START = 130;

    public static final int VX_RED = VX_START + EDGE;
    public static final int VY_RED = VY_START + EDGE;

    public static final int VX_YELLOW = VX_START + EDGE;
    public static final int VY_YELLOW = VY_START + 2*EDGE + LIGHT_DIAMETER ;
    
    public static final int VX_GREEN = VX_START + EDGE;
    public static final int VY_GREEN = VY_START + 3*EDGE + 2*LIGHT_DIAMETER ;
    
    public static final int VX_ARROW = VX_START + EDGE;
    public static final int VY_ARROW = VY_START + 4*EDGE + 3*LIGHT_DIAMETER ;
    
    public static final int VLIGHT_FRAME_WIDTH  = LIGHT_DIAMETER + 2*EDGE;
    public static final int VLIGHT_FRAME_HEIGHT = 4*LIGHT_DIAMETER + 5*EDGE;
    
   
    int[] xValuesV = { VX_ARROW+2 , VX_ARROW+17 , VX_ARROW+26, VX_ARROW+11, 
                       VX_ARROW+26 , VX_ARROW+17 };
    
    int[] yValuesV = { VY_ARROW+25, VY_ARROW+5, VY_ARROW+5, VY_ARROW+25, 
                       VY_ARROW+45, VY_ARROW+45,};
    
    
    private char lightColor = 'R';  //set to red
    private char verticalOrHorizontal = 'H';
    private String titleString = "PanelDemo2";
 
    private JPanel displayPanel;
    private JPanel horizontalPanel;
    private JPanel verticalPanel;
    private JPanel buttonPanel;

    public TrafficLight( )         //constructor
    {   
      
        setTitle(titleString);
        setLayout(new BorderLayout( ));
        getContentPane().setBackground(Color.white);

        displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(1,2));

        horizontalPanel = new JPanel();
        horizontalPanel.setBackground(Color.ORANGE);

        verticalPanel = new JPanel();
        verticalPanel.setBackground(Color.PINK);

        displayPanel.add(horizontalPanel);
        displayPanel.add(verticalPanel);

        add(displayPanel, BorderLayout.CENTER);

        //initialize buttonPanel
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout());
        
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton yellowButton = new JButton("Yellow");
        yellowButton.setBackground(Color.YELLOW);
        yellowButton.addActionListener(this);
        buttonPanel.add(yellowButton);
        
        
        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanel.add(greenButton);
  
        JButton arrowButton = new JButton("Arrow");
        arrowButton.setBackground(Color.GREEN);
        arrowButton.addActionListener(this);
        buttonPanel.add(arrowButton);
        
        Horizontal = new JRadioButton("Horizontal",true);
        Vertical   = new JRadioButton("Vertical",false);
        
        buttonPanel.add(Horizontal);
        buttonPanel.add(Vertical);
        
        Horizontal.addItemListener(this);
        Vertical.addItemListener(this);
        
        radioGroup = new ButtonGroup();
        
        radioGroup.add(Horizontal);
        radioGroup.add(Vertical);
        
        
        
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    public void paint(Graphics g)     //note paint method
    {   
        
        
        super.paint(g);
    
    
        
        //draw light
        if(verticalOrHorizontal == 'H')
        {   
            
                    // set frame for horizontal side 
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(HX_START,HY_START,HLIGHT_FRAME_WIDTH,HLIGHT_FRAME_HEIGHT); 

            // set outline color for  horizontal side ovals
            g.setColor(Color.RED);
            g.drawOval(HX_RED,HY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);

            g.setColor(Color.YELLOW);
            g.drawOval(HX_YELLOW,HY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);

            g.setColor(Color.GREEN);
            g.drawOval(HX_GREEN,HY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);

                    // set black horizontal side ovals
            g.setColor(Color.BLACK);
            g.fillOval(HX_RED,HY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(HX_YELLOW,HY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(HX_GREEN,HY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(HX_ARROW,HY_ARROW,LIGHT_DIAMETER,LIGHT_DIAMETER);



            if (lightColor == 'R' )
            {
                g.setColor(Color.RED);
                g.fillOval(HX_RED,HY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);

            }        
            else if (lightColor == 'Y')
            {
                g.setColor(Color.YELLOW);
                g.fillOval(HX_YELLOW,HY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);

            }
            else if (lightColor == 'G')
            {
                g.setColor(Color.GREEN);
                g.fillOval(HX_GREEN,HY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);

            } 
            else if (lightColor == 'A')
            {
                // draw arrow for horizontal side
                g.setColor(Color.GREEN);
                g.fillPolygon( xValuesH, yValuesH, 6 );  
                g.fillRect(HX_ARROW+20, HY_ARROW+22, 25, 7);

            }
        }
        else if(verticalOrHorizontal == 'V')
        {      
            
                // set frame for vertical side 
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(VX_START,VY_START,VLIGHT_FRAME_WIDTH,VLIGHT_FRAME_HEIGHT); 

            // set outline color for  vertical side ovals
            g.setColor(Color.RED);
            g.drawOval(VX_RED,VY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);

            g.setColor(Color.YELLOW);
            g.drawOval(VX_YELLOW,VY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);

            g.setColor(Color.GREEN);
            g.drawOval(VX_GREEN,VY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);


            // set black vertical side ovals
            g.setColor(Color.BLACK);
            g.fillOval(VX_RED,VY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(VX_YELLOW,VY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(VX_GREEN,VY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);
            g.fillOval(VX_ARROW,VY_ARROW,LIGHT_DIAMETER,LIGHT_DIAMETER);


            if (lightColor == 'R' )
            {
                g.setColor(Color.RED);
                g.fillOval(VX_RED,VY_RED,LIGHT_DIAMETER,LIGHT_DIAMETER);
            }        
            else if (lightColor == 'Y' )
            {
                g.setColor(Color.YELLOW);
                g.fillOval(VX_YELLOW,VY_YELLOW,LIGHT_DIAMETER,LIGHT_DIAMETER);
            }
            else if (lightColor == 'G' )
            {
                g.setColor(Color.GREEN);
                g.fillOval(VX_GREEN,VY_GREEN,LIGHT_DIAMETER,LIGHT_DIAMETER);
            } 
            else if (lightColor == 'A' )
            {
                // draw arrow for vertical side
                g.setColor(Color.GREEN);
                g.fillPolygon( xValuesV, yValuesV, 6 );
                g.fillRect(VX_ARROW+20, VY_ARROW+22, 25, 7);
            }
                
               
          }
          else
          { 
              
              JOptionPane.showMessageDialog(null,"Problem in paint method");
          
          }
    }
    //JButtons, JTextAreas, JMenuItems
    public void actionPerformed(ActionEvent e)
    {
       String actionCommand = e.getActionCommand();    

       if (actionCommand.equals("Red"))
         lightColor = 'R';
       else if (actionCommand.equals("Yellow"))
         lightColor = 'Y';
       else if (actionCommand.equals("Green"))
         lightColor = 'G';
       else if (actionCommand.equals("Arrow"))
         lightColor = 'A';

       repaint( );  //calls paint
    }
  
    //JRadioButtons, JCheckBoxes
    public void itemStateChanged(ItemEvent e)  //not called in this program
    {
      if(Horizontal.isSelected())
      {
          verticalOrHorizontal = 'H';
      }   
      if(Vertical.isSelected())
      {
          verticalOrHorizontal = 'V';  
      }           
      repaint();  //calls paint
    } 
    
}
