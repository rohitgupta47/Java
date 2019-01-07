package io.rohitstudent;

import java.time.LocalDate;
import java.util.Scanner;
//import java
public class StudentMenu {

	public static void main(String[] args) 
	{
		int x=0;
		Model model=new Model();
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter path to store Student information");

		try
		{


			while(x!=5) 
			{
				System.out.println("press 1 to enter student information in file");
				System.out.println("press 2 to update student data in file");
				System.out.println("press 3 to delete student information in file");
				System.out.println("press 4 to sort student based natural or customised sorting");
				x=sc1.nextInt();
				switch(x) 
				{
				case 1:
				{


					System.out.println("enter name of student");
					String name=sc2.nextLine();
					System.out.println("enter registered ID");
					String reg_ID=sc2.nextLine();
					System.out.println("enter email ID");
					String email=sc2.nextLine();
					System.out.println("enter Date of Birth ");
					String d=sc2.nextLine();
					LocalDate dob=LocalDate.parse(d);

					Student s=new Student(name, reg_ID, email, dob);
					model.add(s);

					break;
				}
				
				case 2:
				{
					break;
				}

				}
			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
