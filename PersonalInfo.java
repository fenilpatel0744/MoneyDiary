package org.Moneydiary;
import org.Moneydiary.vars1;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**Class for Getting Info about every Person*/
public class PersonalInfo 
{
	Scanner sc=new Scanner(System.in);
	
	/**Function to get Info of user*/
	public void get_personalDetails()
	{
		
		int i=1;
		
		// scan the filename
		System.out.print("\n  Enter the File Name: ");
		vars1.fileName = sc.nextLine();
		
		try 
		{
			File myObj = new File(vars1.fileName); 
			if (myObj.createNewFile()) 
			{
				
				
				try 
				{
					// Creates a Writer using FileWriter
					BufferedWriter output = new BufferedWriter(new FileWriter(vars1.fileName));
			
					// Take name of user
					System.out.print("\n  Enter Your Name: ");
					vars1.Name=sc.nextLine();
					output.write(vars1.Name);
					output.write("#");
					
					// Take Mobile no of user
					System.out.print("\n  Enter Your Mobile Number: ");
					vars1.Mobileno=sc.nextLine();
					output.write(vars1.Mobileno);
					output.write("#");
					int length = vars1.Mobileno.length();
					if(length<10)
					{
						System.out.println("\n  Please Enter the Valid Mobile Number.");
						output.close();
						myObj.delete();
					}
					else
					{
						// Take email address of user
						System.out.print("\n  Enter Your EmailID: ");
						vars1.emailID=sc.nextLine();
						output.write(vars1.emailID);
						output.write("#");
						if(vars1.emailID != null)
						{								
							String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";  
							Pattern pat = Pattern.compile(emailRegex);
							boolean e =  pat.matcher(vars1.emailID).matches();
							
							if(e == false)
							{
								System.out.println("\n  Please Enter the Valid Email ID.");
								output.close();
								myObj.delete();
							}
							else
							{	
								// Take Monthly salary of user
								System.out.print("\n  Enter Your Monthly Salary: ");
								vars1.salary=sc.nextFloat();
								String s = Float.toString(vars1.salary);
								output.write(s);
								output.write("#");
								// Take Current amount of user
								System.out.print("\n  Enter Current Amount Avaible: ");
								vars1.current_rupees=sc.nextFloat();
								String s1 = Float.toString(vars1.current_rupees);
								output.write(s1);
								output.write("#");
								// Take Saving amount of user
								System.out.print("\n  Enter Saving Amount: ");
								vars1.saving_rupees=sc.nextFloat();
								String s2 = Float.toString(vars1.saving_rupees);
								output.write(s2);
								output.write("#");
								vars1.total=1.0f;
								String s3 = Float.toString(vars1.total);
								output.write(s3);
								output.write("#");
					
								System.out.println("\n  Registration Successfully.....");
								System.out.println("\n  File created: " + myObj.getName());
							}
						}
					}
					
					// Closes the write
						output.close();
				}
				catch (Exception e) 
				{
					e.getStackTrace();
				}
			} 
			else 
			{	
				System.out.println("\n  File already exists.");
			}
		} 
		catch (IOException e) 
		{
			System.out.println("\n  An error occurred.");
			//e.printStackTrace();
		}
		
	}
	
 }
