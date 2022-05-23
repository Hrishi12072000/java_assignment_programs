//Program to display the number is amrstrong fom 1 to 1000

package array;

public class Armstrong_1_1000 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int r,i,s=0,num1;

		for(i=1;i<=1000;i++)
		{
			num1=i;
			s=0;
			while(num1>0)
			{
				r=num1%10;
				s=s+r*r*r;
				num1=num1/10;
			}
			if(i==s)
			{
				System.out.println(s);
			}

		}
	}

}
