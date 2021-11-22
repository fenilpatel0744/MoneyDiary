package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Class for Delete the selected file*/
public class Delete 
{
	/**Function to delete the file record of selected user*/
	public void delete()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		try
        {
            File dt = new File(vars1.fileName);
			if(dt.delete())                      //returns Boolean value  
			{  
				System.out.println("\n  "+ dt.getName() + " deleted");   //getting and printing the file name  
			}  
			else  
			{  
				System.out.println("\n  File does not exists.");  
			}  
        }
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
        
	}
}
