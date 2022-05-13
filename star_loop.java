package loop;

public class star_loop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
// 		    1
//  	   10
//		  101
//		 1010
//		10101
            int i,j;
			for(i=1;i<=5;i++)
				{
					for(j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(j=1;j<=i;j++)
					{
						if(j%2==0)
						{
						System.out.print("0");
						}
						else
						{
							System.out.print("1");
						}
					}
					System.out.println();
				}

	//	    *
	//	   ***
    //	  *****
	//	 *******
    //	*********

		for(i=1;i<=5;i++)
				{
					for(j=i;j<=4;j++)
					{
						System.out.print(" ");
					}	
					for(j=1;j<2*i;j++) 
					{
						System.out.print("*");
					}
					System.out.println();
				}
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for(i=1; i<=5; i++) {
			
			//for loop for blank space
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			//for loop for inner loop
			for(j=1;j<=11-2*i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
		for(i=1; i<=5; i++) {
			
			//for loop for blank space
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			
			//for loop for inner loop
			for(j=1;j<2*i;j++)
			{
				//for blank space in inner loop
				if(j%2==0) {
					System.out.print(" ");
				} 
				//for * in inner loop
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}