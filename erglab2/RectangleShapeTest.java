/*
 * Erman Gurses
 * COSC 3324.002: Object-Oriented Programming
 * Lab2
 */
import java.util.Scanner;

public class RectangleShapeTest {

    
    public static void main(String[] args) 
    {
         String decision;
         
     
     do{   
           
            Scanner keyboard = new Scanner(System.in);

            // Prompt user for lenght  and get parameter
            System.out.print("Enter lenght:");
            double lenght = keyboard.nextDouble();

            // Check lenght less than 0
            while(lenght<0)
            {
                System.out.print("lenght cannot be negative!");
                System.out.print("Enter lenght:");
                lenght=keyboard.nextDouble();

            }
            
			// Prompt user for width  and get parameter
            System.out.print("Enter width:");
            double width = keyboard.nextDouble();

			// Check width less than 0
            while(width<0)
            {
                System.out.print("width cannot be negative!");
                System.out.print("Enter width:");
                width=keyboard.nextDouble();

            }

            RectangleShape  RecShape =  new RectangleShape();

            RecShape.setDimentions(lenght, width);

            // Prompt user lenght, width, area, perimeter, Diagonal
            System.out.println("Length is " + RecShape.getLength() );
            System.out.println("Width is " + RecShape.getWidth() );
            System.out.println("Area is " + RecShape.getArea() );
            System.out.println("Perimeter is " + RecShape.getPerimeter() );
            System.out.println("Diogonal is " + RecShape.getDiogonal());
			
            // Clean buffer
            keyboard.nextLine();
            
            // Prompt user for do again
            System.out.println("Do you want to do again? Y/N");
             
             // get decision
            decision=keyboard.nextLine();
             
      }while(decision.equals("Y") || decision.equals("y"));
    }
}
