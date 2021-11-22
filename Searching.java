package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**Class to search any transaction*/
 public class Searching 
 {
	 String t;
	 Scanner sc=new Scanner(System.in);
	 
	 /**Function to search Current Balance*/
	public void searchbyDate()
	{
		
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		System.out.print("\n  Enter the Date (DD/MM/YYYY): ");
		t=sc.nextLine();
		
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
			File serchObj = new File(vars1.fileName);
		
			try
			{
				
				BufferedReader fr = new BufferedReader(new FileReader(serchObj));
			
				String line = fr.readLine();
			
				while(line!=null)
				{
					String[] words=line.split("#");
				
					if(words[0].equals(t))
					{
						System.out.println("\n  Current Balance: "+words[1]);
						System.out.println("\n  Description: "+words[2]);
						break;
					}
					else
					{	
						line = fr.readLine();
					}
				}
			
				fr.close();
			}
			catch(Exception e)
			{
				System.out.println("\n  Please Check the Details.....");
			}
		}
		
	}	
 }
 
 