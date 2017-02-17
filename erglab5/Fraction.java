/**
 *      Erman Gurses
 *      COSC 3324
 *      A03539870
 */

public class Fraction 
{
    private int num,
                den;
    
    // default constructor 
    public Fraction()       
    {
        this(0,1);        
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
         
         result = maintainSigns(result);
         
         result=recudeFraction(result);
         
       return result;
    } 
       
    // add Method
    public Fraction add ( Fraction x)
    {
    
         Fraction result = new Fraction();
         Fraction a      = new Fraction();
         Fraction b      = new Fraction();
         
         b.num = this.num;
         b.den = this.den;
         
         a.num = x.num;
         a.den = x.den;
         
         a.num = a.num * b.den;
         
         a.den = a.den * b.den; 
         
         
         
         b.num = b.num * x.den;
         
         b.den = b.den * x.den;
         
         a = maintainSigns(a);
         b = maintainSigns(b); 
         
         
         result.num = a.num + b.num;
         
         result.den = a.den;
         
         result=recudeFraction(result);
        
         
       return result;
    } 
    
    //subtract Method
    public Fraction subtract ( Fraction x)
    {
        
         Fraction result = new Fraction();
         Fraction a      = new Fraction();
         Fraction b      = new Fraction();
         
         b.num = this.num;
         b.den = this.den;
         
         a.num = x.num;
         a.den = x.den;
         
         a.num = a.num * b.den;
         
         a.den = a.den * b.den; 
         
         
         
         b.num = b.num * x.den;
         
         b.den = b.den * x.den;
         
         a = maintainSigns(a);
         b = maintainSigns(b); 
         
         
         result.num = b.num - a.num;
         
         result.den = a.den;
         
         result=recudeFraction(result);
        
         
       return result;
    } 
    
    //divide Method
    public Fraction divide ( Fraction x)
    {   
         int temp;
         
         Fraction result = new Fraction();
    
         temp  = x.num;
         x.num = x.den;
         x.den = temp;
         
         
         result.num = this.num * x.num;
         
         result.den = this.den * x.den;
         
         result = maintainSigns(result);
         
         result=recudeFraction(result);
         
       return result;
    } 
    
    //reciprocal Method
    public Fraction reciprocal ()
    {   
         
         
         Fraction result = new Fraction();
    
         result.den = this.num;
         result.num = this.den;
    
    
         result = maintainSigns(result);
         
         
       return result;
    }
       
    //maintainSigns Method
    private Fraction maintainSigns (Fraction x )
    {
        
        if(x.num < 0 && x.den < 0)
        {
            x.num= -1*x.num;
            x.den= -1*x.den;       
        }
          if(x.num > 0 && x.den < 0)
        {
            x.num= -1*x.num;
            x.den= -1*x.den;       
        }
        
    
       return x;
    }
    // recudeFraction Method
    private Fraction recudeFraction(Fraction x)
    {
        int gcf;    //greatest common factor
        boolean continueSearch = true;
 
        gcf = Math.abs(x.den);   //den >= 1
        
        while (gcf > 1 && continueSearch)
        {
            if (x.num%gcf == 0 && x.den%gcf == 0) 
                
                continueSearch = false;
            else
                
                gcf--;
        }
        
        x.num = x.num/gcf;    
        x.den = x.den/gcf;
        
      return x;
      
    }
                     
}