import java.util.Scanner;

public class javaprogram3
{
     public static void main(String args[])
    {
      int num1,num2,area,perimeter;
      
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Enter two numbers:");
      num1=scanner.nextInt();
      num2=scanner.nextInt();

      area=num1*num2;
      perimeter=(num1+num2)*2;
      

      System.out.println("area="+ area);
      System.out.println("perimeter="+ perimeter);
      
     }
}
