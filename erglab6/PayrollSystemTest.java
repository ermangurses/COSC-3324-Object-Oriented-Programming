/**
 *  Erman Gurses                                    
 *  Object Oriented                    
 *  Lab6 
 */

import java.util.Scanner;

public class PayrollSystemTest{

    public static void main(String[] args)
    {
        final double  BONUS = 100;

        String sBonus="---";
       
	String [] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

        Scanner  input = new Scanner (System.in);
        
        SalariedEmployee salariedEmployee = 
                new SalariedEmployee("Erman","Gurses","111-11-1111", 1000.00, 05, 19, 1983 );
        
        HourlyEmployee hourlyEmployee = 
                new HourlyEmployee("Nate","Koch","222-22-2222", 7.5, 45, 2, 14, 1974);
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Michael","Richard","333-33-3333", 4000.00, 0.7, 1000.00, 11, 19, 1985);
        
        
        CommissionEmployee commissionEmployee = 
                new CommissionEmployee("Pascal","Nouma","444-44-4444", 3000.00, 0.9, 9, 21, 1982);
        
	// Declare employees abstract class array        
        Employee[] employees = new Employee[4];
        
	// initialize amployees array
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = basePlusCommissionEmployee;
        employees[3] = commissionEmployee;
       
        // Print each employees information
        for (int i=0; i < employees.length;  i++)
        { 
            System.out.printf("%s\n\n",employees[i].toString());
        
        }
        
	// Prompt the user for month
        System.out.print("Enter Month Please:");
        
	// Get month from the user
        int month = input.nextInt();
        
        double total = 0;
	
	// Print header of report for specified month        
        System.out.printf("\t\tPayroll Report for  %s\n", months[month-1] );
        // Print header of report
	System.out.println("Name\t\t\tType\t\t\tEarnings\tBonus\tAdj Earnings");
        
        
	// Print each kind of employees' report
        for (int i=0; i < employees.length;  i++)
        { 
           if(month==employees[i].getBirthDate().getMonth())
            {
               System.out.printf("%-8s%-10s%-30s%8.2f%14.2f%12.2f\n",
               employees[i].getFirstName(),employees[i].getLastName(),
               employees[i].getClass().getName(),employees[i].earnings()+BONUS,
               BONUS,employees[i].earnings());
                
               total+=employees[i].earnings()+BONUS;
                
            }
            else
            {
                System.out.printf("%-8s%-10s%-30s%8.2f%12s%14.2f\n",
                employees[i].getFirstName(),employees[i].getLastName(),
                employees[i].getClass().getName(),employees[i].earnings(),
                sBonus,employees[i].earnings());
                
                total+=employees[i].earnings();
                
            }
        }
          
	// Print Total Payroll
        System.out.printf("\nTotal Payroll: \t\t\t\t\t\t\t\t  $%.2f\n", total);  
               
    }
}


