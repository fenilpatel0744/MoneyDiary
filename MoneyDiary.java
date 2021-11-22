/* .... Project Money Dairy ....*/

import java.util.*;
import java.io.*;
import org.Moneydiary.Display;
import org.Moneydiary.Delete;
import org.Moneydiary.Debit;
import org.Moneydiary.Searching;
import org.Moneydiary.Deposite;
import org.Moneydiary.PersonalInfo;
import org.Moneydiary.Update;

// Main function of entire project
class MoneyDiary 
{
	public static void main(String[] args)
	{
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Display d1 = new Display();
		Delete d2 = new Delete();
		Debit c = new Debit();
		Searching s = new Searching();
		Deposite d = new Deposite();
		Update u = new Update();
		PersonalInfo p=new PersonalInfo();
		
		// give choice to use to which operation they want to perform
		while(true)
		{
			System.out.println("\n\t\t---------------------");
			System.out.println("\t\tWelcome to Moneydiary");
			System.out.println("\t\t---------------------");
			System.out.println("\n\t\t1. Register");
			System.out.println("\n\t\t2. Credit (Deposite)");
			System.out.println("\n\t\t3. Debit (Spend)");
			System.out.println("\n\t\t4. Search");
			System.out.println("\n\t\t5. Update");
			System.out.println("\n\t\t6. Delete");
			System.out.println("\n\t\t7. Display");
			System.out.println("\n\t\t8. Exit\n");
				
			System.out.print("\n  Enter your choice: ");	
			choice=sc.nextInt();
				
			switch(choice)
			{
				case 1:
						p.get_personalDetails();
						break;
				case 2:
						do
						{
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t     Credit (Deposite)");
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t1. Deposite to Current Amount");
							System.out.println("\n\t\t2. Deposite to Saving Amount" );
							System.out.println("\n\t\t3. Exit\n");
							
							System.out.print("\n  Enter your choice: ");
							choice=sc.nextInt();
								
							switch(choice)
							{
								case 1:
										d.Deposite_into_Current();
										break;
								case 2:
										d.Deposite_into_Saving();
										break;
								case 3:
										break;
								default:
										System.out.println("\n  Please try again....");
										break;
							}
						}while(choice != 3);
						break;
				case 3:
						do
						{
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t     Debit (Spend)");
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t1. Spend from Salary");
							System.out.println("\n\t\t2. Spend from Saving Amount");
							System.out.println("\n\t\t3. Exit\n");
						
							System.out.print("\n  Enter your choice: ");
							choice=sc.nextInt();
								
							switch(choice)
							{
								case 1:
										c.debit_into_Current();
										break;
								case 2:
										c.debit_into_Saving();
										break;
								case 3:										
										break;
								default:
										System.out.println("\n  Please try again....");
										break;
							}
						}while(choice != 3);
						break;
				case 4:
						s.searchbyDate();
						break;
				case 5:
						do
						{
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t      Update");
							System.out.println("\n\t\t-------------------");
							System.out.println("\n\t\t1. Name");
							System.out.println("\n\t\t2. Mobile Number");
							System.out.println("\n\t\t3. Email ID");
							System.out.println("\n\t\t4. Monthly Salary");
							System.out.println("\n\t\t5. Exit\n");
						
							System.out.print("\n  Enter your choice: ");
							choice=sc.nextInt();
								
							switch(choice)
							{
								case 1:
										u.name_update();
										break;
								case 2:
										u.mobileNo_update();
										break;
								case 3:
										u.emailID_update();
										break;
								case 4:
										u.salary_update();
										break;
								case 5:										
										break;
								default:
										System.out.println("\n  Please try again....");
										break;
							}
						}while(choice != 5);
						break;
				case 6:
						d2.delete();
						break;
				case 7:
						d1.show_personalDetail();
						break;
				case 8:
						System.exit(0);
						break;
				default:
						System.out.println("\n  Please try again....");
						break;
			}
		}
	} 
}