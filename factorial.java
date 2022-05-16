//WAP to display the factorial of number given by user.  
package thursday_lab;

import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  int i,fact=1,num;
		  System.out.println("Enter the number to find its factorial");
		  num=sc.nextInt();
		  for(i=1;i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);  

	}

}
