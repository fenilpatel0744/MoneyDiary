package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Class for updating entered data */
public class Update
 {
	Scanner sc=new Scanner(System.in);
	
	/**Function to update the name*/
	public void name_update()
	{
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
         
        BufferedReader fr = null;
         
        FileWriter output = null;
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			
			String line = fr.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = fr.readLine();
			
            }
	
			String[] words=oldContent.split("#");
	
			System.out.print("\n  Enter Your Name: ");
			vars1.Name=sc.nextLine();
			
			String newContent = oldContent.replaceFirst(words[0],vars1.Name);
			
			// Creates a Writer using FileWriter
			output = new FileWriter(fileToBeModified);
			output.write(newContent);

			// Closes the write
			fr.close();
			output.close();	
		}
		catch (Exception e) 
		{
			System.out.println("\n  File does not exists.");
			//e.getStackTrace();
		}
	}
	
	/**Function to update Mobile Number */
	public void mobileNo_update()
	{
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
         
        BufferedReader fr = null;
         
        FileWriter output = null;
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			
			String line = fr.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = fr.readLine();
			
            }
	
			String[] words=oldContent.split("#");
	
			System.out.print("\n  Enter Your Mobile Number: ");
			vars1.Mobileno=sc.nextLine();
			int length = vars1.Mobileno.length();
			if(length<10)
			{
				System.out.println("\n  Please Enter the Valid Mobile Number.");
			}
			else
			{
				String newContent = oldContent.replaceFirst(words[1],vars1.Mobileno);
			
				// Creates a Writer using FileWriter
				output = new FileWriter(fileToBeModified);
				output.write(newContent);
				
				
			}
			
			// Closes the write
			fr.close();
			output.close();
		}
		catch (Exception e) 
		{
			System.out.println("\n  File does not exists.");
			//e.getStackTrace();
		}
	}
	
	/** Function to update Email Address*/
	public void emailID_update()
	{
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
         
        BufferedReader fr = null;
         
        FileWriter output = null;
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			
			String line = fr.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = fr.readLine();
			
            }
	
			String[] words=oldContent.split("#");
	
			System.out.print("\n  Enter Your EmailID: ");
			vars1.emailID=sc.nextLine();
			
			if(vars1.emailID != null)
			{
				String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";  
				Pattern pat = Pattern.compile(emailRegex);
				boolean e =  pat.matcher(vars1.emailID).matches();
							
				if(e == false)
				{
					System.out.println("\n  Please Enter the Valid Email ID.");
				}
				else
				{
					String newContent = oldContent.replaceFirst(words[2],vars1.emailID);
			
					// Creates a Writer using FileWriter
					output = new FileWriter(fileToBeModified);
					output.write(newContent);
					
					
				}
			}
			
			fr.close();
			output.close();

			// Closes the write
			
		}
		catch (Exception e) 
		{
			System.out.println("\n  File does not exists.");
			//e.getStackTrace();
		}
	}
	
	/**Function to update Monthly Salary*/
	public void salary_update()
	 {
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
         
        BufferedReader fr = null;
         
        FileWriter output = null;
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			
			String line = fr.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = fr.readLine();
			
            }
	
			String[] words=oldContent.split("#");
	
			System.out.print("\n  Enter Your Monthly Salary: ");
			vars1.salary=sc.nextFloat();
		
			String str = Float.toString(vars1.salary);
			
			String newContent = oldContent.replaceFirst(words[3],str);
			
			// Creates a Writer using FileWriter
			output = new FileWriter(fileToBeModified);
			output.write(newContent);

			// Closes the write
			fr.close();
			output.close();	
		}
		catch (Exception e) 
		{
			System.out.println("\n  File does not exists.");
			//e.getStackTrace();
		}
	 }
}
 
 