/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab12
 */
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;    //JButton, JTextArea, JMenuItem, 
                                      //  JRadioButtonMenuItem

import javax.swing.*;              

public class AuctionFrame extends JFrame //implements ActionListener
{
     private JTextArea display;
    
     
     private JMenu actionsMenu;     
     private JMenu merchandiseMenu; 
     private JMenu maxBidPriceMenu; 
     
     private JMenuItem clearList;
     private JMenuItem addSelection;
     private JMenuItem deleteLastSelection;
     private JMenuItem quit;
  
     
     private JMenuItem oakTable; 
     private JMenuItem mustangSet; 
     private JMenuItem navajoBlanket;
     private JMenuItem lacquerVase; 
     private JMenuItem cartierBaignoireWatch;
     
     private JMenuItem oval; 
     private JMenuItem rectangular; 
     private JMenuItem square;
   
     private JMenuItem specialSet; 
     private JMenuItem regularSet;    
      
     private JMenuItem $30;
     private JMenuItem $185;
     private JMenuItem $1000; 
     private JMenuItem $1500;
     private JMenuItem $2500;
   
     private String merchandise;
     private String maxBidPrice;
     
     private int counter;
     
   public AuctionFrame()
   {
      super( "Auction Bidding List");     

      setLayout(new FlowLayout() );
     
      display = new JTextArea(20,43);
      display.setText("Current Bid List:");
      display.setEditable(false);
      add(new JScrollPane (display));
      
      //add(display);
      
      actionsMenu     = new JMenu( "Actions" ); // create file menu
      merchandiseMenu = new JMenu( "Merchandise" );
      maxBidPriceMenu = new JMenu( "Max Bid Price" );
      
      JMenuBar bar = new JMenuBar();       // create menu bar
      setJMenuBar( bar );                  // add menu bar to application
      bar.add(actionsMenu);                 // add file menu to menu bar
      bar.add(merchandiseMenu);  
      bar.add(maxBidPriceMenu);  
      
      clearList           = new JMenuItem("Clear List"); 
      addSelection        = new JMenuItem("Add Selection"); 
      deleteLastSelection = new JMenuItem("Delete Last Selection");  
      quit                = new JMenuItem("Quit");
      
      actionsMenu.add(clearList);
      actionsMenu.add(addSelection);
      actionsMenu.add(deleteLastSelection);
      actionsMenu.add(quit);
      
      
      oakTable              = new JMenuItem("Oak Table"); 
      mustangSet            = new JMenuItem("1957 Mustang Hub Cap Set"); 
      navajoBlanket         = new JMenuItem("Navajo Blanket");  
      lacquerVase           = new JMenuItem("Lacquer Vase");
      cartierBaignoireWatch = new JMenuItem("Cartier Baignoire Watch");
      
      
      merchandiseMenu.add(oakTable);
      merchandiseMenu.add(mustangSet);
      merchandiseMenu.add(navajoBlanket);
      merchandiseMenu.add(lacquerVase);
      merchandiseMenu.add(cartierBaignoireWatch);

      $30   = new JMenuItem("$30"); 
      $185  = new JMenuItem("$185"); 
      $1000 = new JMenuItem("$1,000");  
      $1500 = new JMenuItem("$1,500");
      $2500 = new JMenuItem("$2,500");
      
      
      maxBidPriceMenu.add($30);
      maxBidPriceMenu.add($185);
      maxBidPriceMenu.add($1000);
      maxBidPriceMenu.add($1500);
      maxBidPriceMenu.add($2500);
  
      //merchandise = oakTable.getText();
      //maxBidPrice = $30.getText();
      
      
      clearList.addActionListener(
              
              new ActionListener()
              { 
                  public void actionPerformed(ActionEvent event)
                  {                 
                       display.setText("Current Bid List:");
                  }   
              }        
      );// quit 
      
      counter = 0;
      
      addSelection.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {       
                     String tempString = display.getText();;                      
                     
                     if(merchandise == null || maxBidPrice == null)
                     {
                          display.append("\n You have to select Merchandise"
                                  + " and Price");
                          
                          counter++;
                     }
                     else
                     {
                         if(counter != 0)
                         {
                                for(int i = 1; i <= counter; i++ )
                                {
                                    int lastIndex = tempString.lastIndexOf("\n");
                     
                                    tempString = tempString.substring(0,lastIndex);
                     
                                    display.setText(tempString);
                        
                                }
                                display.append("\n"+merchandise +": "+ maxBidPrice);
                                
                                counter = 0;
                         }
                         else
                         {
                         
                            display.append("\n"+merchandise +": "+ maxBidPrice);
                         
                         
                        }
                     
                     }  
                        
                    maxBidPrice = null;
                    merchandise = null;
                    
                 }
                 
              }        
      );// addSelection 
      
      deleteLastSelection.addActionListener(
     
              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {          
                     String tempString = display.getText();
                     
                     if(0 < tempString.lastIndexOf("\n"))
                     {

                        int lastIndex = tempString.lastIndexOf("\n");
                     
                        tempString = tempString.substring(0,lastIndex);
                     
                        display.setText(tempString);
                     }
                    
                 }   
              }        
      );// addSelection 
      
      quit.addActionListener(
              
              new ActionListener()
              { 
                  public void actionPerformed(ActionEvent event)
                  {                 
                      System.exit(0);
                  
                  }   
              }        
      );// quit 
      

      oakTable.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      merchandise = event.getActionCommand();
                 }   
              }        
       );// oakTable

       mustangSet.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      merchandise = event.getActionCommand();
                 }   
              }        
       );// mustangSet
      
       
       navajoBlanket.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      merchandise = event.getActionCommand();
                 }   
              }        
       );// navajoBlanket
     
       lacquerVase.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      merchandise = event.getActionCommand();
                 }   
              }        
       );// lacquerVase
    
        
       cartierBaignoireWatch.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      merchandise = event.getActionCommand();
                 }   
              }        
       );// cartierBaignoireWatch
        
 
       
       $30.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      maxBidPrice = event.getActionCommand();
                 }   
              }        
       );// $30
         
         
       $185.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      maxBidPrice = event.getActionCommand();
                 }   
              }        
       );// $185
         
           
       $1000.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      maxBidPrice = event.getActionCommand();
                 }   
              }        
       );// $1000
    
       $1500.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      maxBidPrice = event.getActionCommand();
                 }   
              }        
       );// $1500
   
      
       $2500.addActionListener(

              new ActionListener()
              { 
                 public void actionPerformed(ActionEvent event)
                 {                      
                      maxBidPrice = event.getActionCommand();
                 }   
              }        
       );// $2500

       
       
       
   } // constructor

} // end class MenuFrame
