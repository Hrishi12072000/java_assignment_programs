package loop;

import java.util.*;

public class table 
{

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,n;
	    System.out.println("Enter the number for which you want table ");
	    n=sc.nextInt();
		for(i=1;i<11;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		System.out.println();
			

	}

}
