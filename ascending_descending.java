package loop;

//Program to arrange elements of array in ascending/descending order

import java.util.*;

public class ascending_descending
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size,i,j;

		System.out.println("Enter size of array:");  //taking the  size of array 
		size=sc.nextInt();

		int[] marks = new int[size];

		System.out.println("Enter the elements for array:");  //loop for taking array elements from user
		for(i=0;i<size;i++)
		{
			marks[i]=sc.nextInt();
		}

		//Ascending order-------nested loop for arranging in ascending order
		for(i=0; i<size; i++) 
		{
			for(j=i; j<size; j++) 
			{
				if(marks[i] > marks[j]) 
				{
					int temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
			}
		}
		System.out.println("Array elements in ascending order:");
		for(i=0; i<size; i++) 
		{
			System.out.print(marks[i]+"\t");
		}
		System.out.println();

		//Descending order//nested loop for arranging in descending order
		for(i=0; i<size; i++) {
			for(j=i; j<size; j++) {
				if(marks[i] < marks[j]) {
					int temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
			}
		}
		System.out.println("Array elements in descending order:");
		for(i=0; i<size; i++) {
			System.out.print(marks[i]+"\t");//marks[i] is taken to print the value of marks[i] only
		}
		System.out.println();
	}

}

