/**
 *      Erman Gurses
 *      COSC 3324
 *      A03539870
 */


// Declaration of Fraction class
public class Fraction 
{
    private int num,
                den;
    
    // default constructor 
    public Fraction()       
    {
        this(0,1);
//        num=0;
//        den=1;
    }
    
    // Overloaded constructor
    public Fraction( int num)
    {       
        this(num,1);
    }
    
    //Overloaded contructor
    public Fraction(int num, int den)
    {
         setValue(num,den);
    }
    
    // setValue Method
    public void setValue(int num, int den)
    {
        this.num=num;
        this.den=den;
    }
    
    // Override toString Method
    public String toString()
    {    
      return String.format("%d/%d",num,den);    
    }       
     
    // multply Method
    public Fraction multiply ( Fraction x)
    {
    
         Fraction result = new Fraction();
    
         result.num = this.num * x.num;
         
         result.den = this.den * x.den;
         
       return result;
    } 
}
