
/** 
 *	Erman Gurses	
 *	COSC 3324
 *	A03539870
 */

import java.util.Scanner;

public class MinMaxTest {

    public static void main(String[] args) {
           
        int minimumI,
            maximumI;
       
        double minimumD,
               maximumD;
        
        String decisionToContinue,
	       decisionDataType;
        
        // declare min and max objects
        MinMax min = new MinMax();
        MinMax max = new MinMax();
        
        // declare keyboard object
        Scanner keyboard = new Scanner(System.in);
        do{   
       
	    System.out.print("What kind of data type do you want to enter?");
	    System.out.print("\nFor integer press I\nFor double  press D\n");           
       
	    decisionDataType = keyboard.nextLine();
	
	    if(decisionDataType.equals("I") || decisionDataType.equals("i"))   
	    {	
	  
           	// Prompt user to get 1. Number
            	System.out.print("Enter 1. Number:");
            	int number1 = keyboard.nextInt();
            
            	// Prompt user to get 2. Number
            	System.out.print("Enter 2. Number:");
            	int number2 = keyboard.nextInt();
            
            	// Prompt user to get 3. Number
            	System.out.print("Enter 3. Number:");
            	int number3 = keyboard.nextInt();
            
            	// Method call
            	minimumI = min.findMinimum(number1, number2, number3);
            	maximumI = max.findMaximum(number1, number2, number3);

  	    	// Formatted print for all numbers then shows maximum and minumum numbers
            	System.out.printf("1. Number =%-18d\n2. Number =%-18d\n3. Number =%-18d\n",
            	number1,number2,number3);
            	System.out.printf("Maximum Number =%-18d\nMinimum Number =%-18d\n",maximumI,minimumI);
            }

	    if(decisionDataType.equals("D") || decisionDataType.equals("d"))
            {
              
                // Prompt user to get 1. Number
                System.out.print("Enter 1. Number:");
                double number1 = keyboard.nextDouble();

                // Prompt user to get 2. Number
                System.out.print("Enter 2. Number:");
                double number2 = keyboard.nextDouble();
        
                // Prompt user to get 3. Number
                System.out.print("Enter 3. Number:");
                double number3 = keyboard.nextDouble();
                
                // Method call
                minimumD =  min.findMinimum(number1, number2, number3);
                maximumD =  max.findMaximum(number1, number2, number3);
        
                // Formatted print for all numbers then shows maximum and minumum numbers
                System.out.printf("1. Number =%-18.2f\n2. Number =%-18.2f\n3. Number =%-18.2f\n",
                number1,number2,number3);
                System.out.printf("Maximum Number =%-18.2f\nMinimum Number =%-18.2f\n",maximumD,minimumD);
            }
            
            keyboard.nextLine();
            
            // Prompt user do it again
            System.out.printf("Do you want to do again? Y/N\n");
            
            // Get decisionToContinue;
            decisionToContinue=keyboard.nextLine();
          
       // repeat while decison equals "Y" or "y"     
      }while(decisionToContinue.equals("Y") || decisionToContinue.equals("y"));
       
    }
}
