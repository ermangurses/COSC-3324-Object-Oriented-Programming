
/*
 * 
 *	Erman Gurses	
 *	COSC 3324
 *	A03539870
 */

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class FractionTest {

   
    public static void main(String[] args)
    {
        // defination of  Fraction objects 
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        Fraction multiplyFraction    = new Fraction();
        Fraction divideFraction      = new Fraction();
        Fraction addFraction         = new Fraction();
        Fraction subtractFraction    = new Fraction();
        Fraction reciprocalFraction1 = new Fraction();
        
        
        // defination the other variables
        String decision;
        int numerator1, numerator2, denominator1, denominator2;
       
        String firstFraction;
        String numeratorString1;
        String denominatorString1;
        String secondFraction;
        String numeratorString2;
        String denominatorString2;
        StringTokenizer divideFraction1;
        
        String  messageDivide = String.format("Invalid Division Operation\n");
        String  message;
        
        String delimeters = "/"; 
        
        
        do
        {
           do 
           { 
               
               firstFraction =                                          
               JOptionPane.showInputDialog( "Enter First Fraction, Example 3/5" );

               divideFraction1 = new StringTokenizer (firstFraction,delimeters);

               numeratorString1 = divideFraction1.nextToken();

               denominatorString1 = divideFraction1.nextToken();

               numerator1 = Integer.parseInt(numeratorString1.trim());

               denominator1 = Integer.parseInt(denominatorString1.trim());


               secondFraction =                                          
               JOptionPane.showInputDialog( "Enter Second Fraction, Example 3/5" );

               StringTokenizer divideFraction2;

               divideFraction2 = new StringTokenizer (secondFraction,delimeters);

               numeratorString2 = divideFraction2.nextToken();

               denominatorString2 = divideFraction2.nextToken();

               numerator2 = Integer.parseInt(numeratorString2.trim());

               denominator2 = Integer.parseInt(denominatorString2.trim());
                    
                    
               if(denominator1==0 || denominator2==0)
               {
                  JOptionPane.showMessageDialog( null, "Denominater cannot be 0" );
               }
                                     
            }while(denominator1==0 || denominator2==0);         
                    
            //Send variables to setValue methods
            a.setValue(numerator1,denominator1);
            b.setValue(numerator2,denominator2);

           
            // call multiply method
           
            addFraction      = a.add(b);
            
            
            subtractFraction = a.subtract(b);
            
            multiplyFraction = a.multiply(b);
            
            if(numerator2!=0)
            {
                divideFraction   = a.divide(b);
            }      
            
            reciprocalFraction1 = a.reciprocal();  
            
             
            // Prepare message format
            String messageAdd = String.format("The Result Is\n%d/%d + %d/%d = %s",
            numerator1,denominator1,numerator2,denominator2,addFraction.toString());
            
            String messageSubtract = String.format("\n%d/%d - %d/%d = %s",
            numerator1,denominator1,numerator2,denominator2,subtractFraction.toString());
            
            String messageMultiply = String.format("\n%d/%d * %d/%d = %s",
            numerator1,denominator1,numerator2,denominator2,multiplyFraction.toString());
            
            String messageReciprocal = String.format("\nReciprocal of %d/%d is %s",
            numerator1, denominator1,reciprocalFraction1.toString());
         
            
            // Check Numerator2
            if(numerator2!=0)
            {
                messageDivide = String.format("\n%d/%d / %d/%d = %s",
                numerator1,denominator1,numerator2,denominator2,divideFraction.toString());
            }
            
            
            if(numerator2!=0)
            {
            
                 message = messageAdd+messageSubtract+messageMultiply+messageDivide+messageReciprocal;
            }
            else
            {
            
                 message = messageAdd+messageSubtract+messageMultiply+messageReciprocal;
            
            }
            
            // Prompt Message
            JOptionPane.showMessageDialog( null, message );
               
              
            // Get decision from user
            decision =                                          
            JOptionPane.showInputDialog( "Do you want to do again? Y/N");
                   
        }while(decision.equals("Y") || decision.equals("y"));
        
        return;
    }
}
