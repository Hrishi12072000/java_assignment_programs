package array;

import java.util.Scanner;

public class Mix_2arr 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,j,row,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		row=sc.nextInt();
		System.out.println("Enter the number of col:");
		col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the number in row and col to display:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
			    System.out.println();
			}
			/*int a,b,rows,cols;
			System.out.println("enter the number// of row");
			rows=sc.nextInt();
			System.out.println("enter the number// of col");
			cols=sc.nextInt();
			int[][] arr2=new int[rows][cols];
			System.out.println("enter the number of row and col");
			for(a=0;a<row;a++)
			{
				for(b=0;b<col;b++)
				{
					arr[a][b]=sc.nextInt();
				}
			}
				for(a=0;a<row;a++)
				{
					for(b=0;b<col;b++)
					{
						System.out.println(arr[a][b]);
					}
				    System.out.println(); 
				}*/
	}
}
