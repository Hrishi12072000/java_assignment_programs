package array;

import java.util.Scanner;

public class palindrome
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  int r,sum=0,temp,n;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number to check palindrome");
		  n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
	}

}
