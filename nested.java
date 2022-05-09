package ja_va;

import java.util.Scanner;

public class nested

{
		public static void main(String arg[])
		{
			int ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("select your choice \n 1.Greater number amgonst three number \t 2.Area of rectangle \n 3.find the cube of number \t 4.accept age and gender and display RI.");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				int num1,num2,num3;
				System.out.println("Enter first number");
				num1=sc.nextInt();
				System.out.println("Enter second number");
				num2=sc.nextInt();
				System.out.println("Enter third number");
				num3=sc.nextInt();
				if(num1>num2 && num1>num3)
				{
					System.out.println("Greater number is:-"+num1);
				}
				else if(num2>num3)
				{
					System.out.println("Greater number is:-"+num2);
				}
				else
				{
					System.out.println("Greater number is:-"+num3);
				}
				break;
				
			case 2:
			{
				int l,b,area;
				System.out.println("Enter the length of reactangle");
				l=sc.nextInt();
				System.out.println("Enter the breadth of rectangle");
				b=sc.nextInt();
				area=l*b;
				System.out.println("Area of rectangle of "+l+" and "+b+"="+area);
			}
				break;
				
			case 3:
			{
				int num;
				System.out.println("Enter the number to find out its cube");
				num=sc.nextInt();
				if(num%7==0)
				{
					System.out.println("Cube of number is"+num);
				}
				else
				{
					System.out.println("You have entered invalide number \n please enter the number which is divisible by 7");
				}
			}
				break;
				
			case 4:
			{
				int age;
				char gender;
				System.out.println("Enter the age");
				age=sc.nextInt();
				System.out.println("Enter the gender");
				gender=sc.next().charAt(0);
				if(age<=60 && gender=='m')
				{
					System.out.println("Rate of interest is 7%");
		        }
				else if(age>=60 && gender=='f')
			    {
				    System.out.println("Rate of interest is 7.5%");
			    }
				else
				{
					System.out.println("Rate of interest is 5%");
				}
					
			}
	   }
 }
}