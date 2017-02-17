/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab12
 */
import javax.swing.JFrame;

public class AuctionFrameTest
{
   public static void main( String[] args )
   { 
      AuctionFrame auctionFrame = new AuctionFrame();//Create AuctionFrame 
      auctionFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      auctionFrame.setSize( 500, 400); // set frame size
      auctionFrame.setLocation(600, 400);
      auctionFrame.setVisible( true ); // display frame
   } // end main
} // end class MenuTest
