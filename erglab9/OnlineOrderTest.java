/**
 *      Erman Gurses
 *      COSC 3324
 *      A03539870
 */
import javax.swing.JFrame;

public class OnlineOrderTest
{
  public static final int WIDTH = 1000;
  public static final int HEIGHT = 400;
	
  public static void main (String[] args)
  {
    OnlineOrder onlineOrder = new OnlineOrder();
    onlineOrder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    onlineOrder.setSize(WIDTH, HEIGHT);
	onlineOrder.setLocation(500, 100);
    onlineOrder.setVisible (true);
  }
}
