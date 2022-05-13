package array;

import java.util.Scanner;

public class arr_2d
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		row=sc.nextInt();
		System.out.println("enter the number of col");
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("enter the number of row and col");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			for(j=0;j<col;j++)
			{
				int temp=  row;
				    row =  col;
				    col =  temp;
				    
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
			    System.out.println();
			}
	}
}