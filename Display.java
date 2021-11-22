package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**Class to display all records about selected user */
public class Display 
 {
	 /**Function to display all details about selected user*/
	public void show_personalDetail()
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		try 
		{
			BufferedReader fr = new BufferedReader(new FileReader(vars1.fileName));    
			String record= fr.readLine();
			String[] words=record.split("#");
			System.out.println("\n  Name: "+words[0]);
			System.out.println("\n  Mobile: "+words[1]);
			System.out.println("\n  Email: "+words[2]);
			System.out.println("\n  Total Salary: "+words[3]);
			System.out.println("\n  Available Balance: "+words[4]);
			System.out.println("\n  Saving Account Balance: "+words[5]);
			String total = Float.toString(Float.parseFloat(words[6])-1);
			System.out.println("\n  Total Spending : "+total);
				
			fr.close();  
		}
		catch (Exception e) 
		{
			System.out.println("\n  File does not exists.");
			//e.getStackTrace();
		}
	}	
 }
 