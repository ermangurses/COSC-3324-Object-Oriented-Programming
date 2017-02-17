/*
 * 
 *	Erman Gurses	
 *	COSC 3324
 *	A03539870
 */


import java.util.Scanner;

public class FractionTest {

   
    public static void main(String[] args)
    {
        // defination of 3 Fraction objects 
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction c = new Fraction();
        
        // defination the other variables
        String decision;
        int numerator1, numerator2, denominator1, denominator2;
       
        // defination of keyboard object
        Scanner keyboard = new Scanner(System.in);
       
        do
        {
            // Prompt and get First Fraction's numerator
            System.out.printf("Enter First Fraction's numerator:");
            numerator1=keyboard.nextInt();
            
            // Prompt and get First Fraction's denominator
            System.out.printf("Enter First Fraction's denominator:");
            denominator1=keyboard.nextInt();
            
            // Prompt and get Second Fraction's numerator
            System.out.printf("Enter Second Fraction's numerator:");
            numerator2=keyboard.nextInt();
            
            // Prompt and get Second Fraction's denominator
            System.out.printf("Enter Second Fraction's denominator:");
            denominator2=keyboard.nextInt();
            
            //Send variables to setValue methods
            a.setValue(numerator1,denominator1);
            b.setValue(numerator2,denominator2);

            // Prompt user  what entered 
            System.out.println("a = " + a.toString());
            System.out.println("b = " + b.toString());

            // call multiplu method
            c=a.multiply(b);
            
            // Prompt User result 
            System.out.println("a*b = " + c.toString());
            
            // Flush keyboard buffer
            keyboard.nextLine();
            
            // Prompt user whether or not do it again
            System.out.print("Do you want to do again? Y/N\n");
                
            
            // Get decision from user
            decision = keyboard.nextLine();
            
        }while(decision.equals("Y") || decision.equals("y"));
        
        return;
    }
}
