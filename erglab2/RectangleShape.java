/*
 * Erman Gurses
 * COSC 3324.002: Object-Oriented Programming
 * Lab2
 */
public class RectangleShape {
    
    double length;
    double width;
    
    //Constructor with no parameters that initializes length and width to zero
     public  RectangleShape()
    {
        length=0;
        width=0;
    }
    
    //Constructor with 2 parameters to initialize the length and width
    public  RectangleShape(double lenght, double width)
    {
        this.length=lenght;
        this.width=width;
    }
    
    //Method to set the dimensions with 2 parameters for length and width
    public void setDimentions(double lenght, double width)
    {
        this.length = lenght;
        this.width = width;
    
    }
    
    //Method to return the length
    public double getLength()
    {
        return length;
    
    }
    
    //Method to return the width
    public double getWidth()
    {
        return width;
    
    }
    
    //Method to return the area
    public double getArea()
    {
        return length*width;
    
    }
    //Method to return the perimeter
    public double getPerimeter()
    {
        return 2*(length+width);
    
    }
    //method to return the diagonal of the rectangle
    public double getDiogonal()
    {
        return Math.sqrt((length*length)+(width*width));
    
    } 
    
}
