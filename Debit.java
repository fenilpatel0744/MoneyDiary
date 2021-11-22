package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 /** Class to credit amount in out account*/
 public class Debit 
 {
	 
	float amount;
	String str;
	 Scanner sc=new Scanner(System.in);
	 
	 /**Function to credit amount from current account*/
	 public void debit_into_Current()
	 {
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
        String oldContent2 = "";
         
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
			
			System.out.print("\n  Enter the amount you want to Credit: ");
			amount=sc.nextFloat();
			
			str = Float.toString(Float.parseFloat(words[4])-amount);
			
			String newContent = oldContent.replaceFirst(words[4], str);
			
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
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			String line = fr.readLine();
			while (line != null) 
			{
				oldContent2 = oldContent2 + line + System.lineSeparator();
				line = fr.readLine();			
			}
			String[] words2=oldContent2.split("#");
			String str1=Float.toString(Float.parseFloat(words2[6])+amount);
			String newContent1 = oldContent2.replace(words2[6],str1);
			output = new FileWriter(fileToBeModified);
			output.write(newContent1);
			
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
			fr.close();
			// Closes the write
			output.close();	
		}
		catch (Exception e) 
		{
			System.out.println("\n  Error occurred or File does not exists.");
			//e.getStackTrace();
		}
	}
	 
	 /**Function to credit amount from saving account */
	 public void debit_into_Saving()
	 {
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.next();
		
		File fileToBeModified = new File(vars1.fileName);
         
        String oldContent = "";
        String oldContent2 = "";
         
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
	
			System.out.print("\n  Enter the amount you want to Credit: ");
			amount=sc.nextFloat();
			
			String newContent = oldContent.replaceAll(words[5],Float.toString(Float.parseFloat(words[5])-amount));
			
			// Creates a Writer using FileWriter
			output = new FileWriter(fileToBeModified);
			output.write(newContent);

			// Closes the write
			fr.close();
			output.close();	
		}
		catch (Exception e) 
		{
			System.out.println("\n  Error occurred or File does not exists.");
			//e.getStackTrace();
		}
		
		try 
		{
			fr = new BufferedReader(new FileReader(fileToBeModified));
			String line = fr.readLine();
            while (line != null) 
            {
                oldContent2 = oldContent2 + line + System.lineSeparator();
                line = fr.readLine();			
            }
			String[] words2=oldContent2.split("#");
			String str1=Float.toString(Float.parseFloat(words2[6])+amount);
			String newContent1 = oldContent2.replace(words2[6],str1);
			output = new FileWriter(fileToBeModified);
			output.write(newContent1);
			
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
			
			fr.close();
			output.close();	
		}
		catch (Exception e) 
		{
			System.out.println("\n  Error occurred or File does not exists.");
			//e.getStackTrace();
		}
	 }
	 
 }
 