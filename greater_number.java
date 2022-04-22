//wap to accept two numbers from user to find out the greater number.

import java.util.Scanner;
public class greater_number
{
    public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 1st Number:");
		num1 = scanner.nextInt();
		System.out.println("Enter 2nd Number:");
		num2 = scanner.nextInt();
		
		if (num1>num2) 
		{
			System.out.println(num1+" is greater than "+num1+".");
		} 
		else
		{
			System.out.println(num2+" is greater than "+num1+".");
		}

	}

}