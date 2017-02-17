
/**
 *      Erman Gurses
 *      COSC 3324
 *      A03539870
 */

public class MinMax
{
	//instance variables
	private int x,
		    y,
		    z;
	
	private double a,
		       b,
		       c;
	
	//findMinimum overloading method
	public int findMinimum(int x, int y, int z )
	{
		int minimum = x;

		if(y < minimum)
		{
		   minimum=y;	
		}
		
		if(z < minimum)
		{
		   minimum=z;
		}

		return minimum;

	}// end findMinimum
	
	// findMinimum overloading method
	public double findMinimum(double a, double b, double c)
	{
	     
                double minimum = a;
        
                if(b < minimum)
                {
                   minimum=b;
                }
         
                if(c < minimum)          
                {
                   minimum=c;
                }
                
                return minimum;
	
	}// end findMinimum
	
	// findMaximum overloading method
        public int findMaximum(int x, int y, int z )
        { 
		int maximum = x;

		if(y > maximum)                                   
                {  
                   maximum=y;
                }          
                           
                if(z > maximum)
                { 
                  maximum=z;
                }
        
   	   return maximum;

	}// end findMaximum

	// findMaximum overloading method
  	public double findMaximum(double a, double b, double c)
        {            
              
                double maximum = a;
                 
                if(b > maximum)
                {
                   maximum=b;
                }
                 
                if(c > maximum)
                {
                   maximum=c;
                }
                
                return maximum;

        }// end findMaximum  

}