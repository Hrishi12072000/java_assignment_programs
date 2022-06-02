package Lab3;

import java.util.Scanner;

public class Ass_2june_1_avg 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int num, y, i;
		float avg = 0; 
		// num - To store number of elements 
		// avg - To store total average value 
		// y - To store total input numbers 
		System.out.println ("Enter the number of elements to calculate the average:");
		num = sc.nextInt();
		System.out.println ("Enter " + num + " elements one by one"); 
		for(i = 0; i < num; i++) 
		{
			y = sc.nextInt();
			avg += y; 
		} 
		avg /= num;
		System.out.println ("\nThe average of the entered input numbers is = " + avg); 
	
	}
}
