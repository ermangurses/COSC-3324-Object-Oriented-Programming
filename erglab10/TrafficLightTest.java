/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab10
 */
import javax.swing.JFrame;

public class TrafficLightTest
{
  public static final int WIDTH = 600;
  public static final int HEIGHT = 500;

  public static void main (String[] args)
  {
    TrafficLight demo = new TrafficLight();
    demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    demo.setSize(WIDTH, HEIGHT);
    demo.setVisible (true);
  }
}
