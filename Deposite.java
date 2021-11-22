package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Class to Deposite amount in account*/
public class Deposite 
 {
	float amount;
	 Scanner sc=new Scanner(System.in);
	 
	/**Function to deposite amount into current account*/
	public  void Deposite_into_Current()
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
	
			System.out.print("\n  Enter the amount you want to Deposite: ");
			amount=sc.nextFloat();
			
			String str = Float.toString(Float.parseFloat(words[4])+amount);
			
			String newContent = oldContent.replaceFirst(words[4],str);
			
			// Creates a Writer using FileWriter
			output = new FileWriter(fileToBeModified);
			output.write(newContent);
		
			System.out.print("\n  Enter the Date (DD/MM/YYYY): ");
			vars1.d=sc.next();
			output.write(vars1.d);
			output.write("#");
			String[] words3=vars1.d.split("/");
			if(31 < Integer.parseInt(words3[0]) || Integer.parseInt(words3[0]) < 1 || words3[0].length() != 2)
			{
				System.out.println("\n  Please Enter the Valid Day.");
			}
			else if(12 < Integer.parseInt(words3[1]) || Integer.parseInt(words3[1]) < 1 || words3[1].length() != 2)
			{
				System.out.println("\n  Please Enter the Valid Month.");
				
			}
			else if(words3[2].length() != 4)
			{
				System.out.println("\n  Please Enter the Valid Year.");
			}
			else
			{
				output.write(str);
				output.write("#");
				System.out.print("\n  Description: ");
				vars1.desc=sc.next();
				output.write(vars1.desc);
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
	 
	 /**Function to deposite amount into saving account*/
	 public void Deposite_into_Saving()
	 {
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.next();
		
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
	
			System.out.print("\n  Enter the amount you want to Deposite: ");
			amount=sc.nextFloat();
			
			String newContent = oldContent.replaceFirst(words[5],Float.toString(Float.parseFloat(words[5])+amount));
			
			// Creates a Writer using FileWriter
			output = new FileWriter(fileToBeModified);
			output.write(newContent);
		
			System.out.print("\n  Enter the Date (DD/MM/YYYY): ");
			vars1.d=sc.next();
			output.write(vars1.d);
			output.write("#");
			String[] words3=vars1.d.split("/");
			if(31 < Integer.parseInt(words3[0]) || Integer.parseInt(words3[0]) < 1 || words3[0].length() != 2)
			{
				System.out.println("\n  Please Enter the Valid Day.");
			}
			else if(12 < Integer.parseInt(words3[1]) || Integer.parseInt(words3[1]) < 1 || words3[1].length() != 2)
			{
				System.out.println("\n  Please Enter the Valid Month.");
				
			}
			else if(words3[2].length() != 4)
			{
				System.out.println("\n  Please Enter the Valid Year.");
			}
			else
			{
				System.out.print("\n  Description: ");
				vars1.desc=sc.next();
				output.write(vars1.desc);
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
 }
 