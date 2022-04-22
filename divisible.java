//wap to accept a no from user if no is divisible by 7 than find out the cube.

import java.util.Scanner;
public class divisible
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("Enter a number to find out its cube:");
		num = scanner.nextInt();
		
		if (num%7==0) 
		{
			System.out.println("The cube of "+num+" is "+(num*num*num)+".");
		} 
		else 
		{
			System.out.println("You have entered invalid number.\nEnter a number which is divisible by 7.");
		}

	}

}