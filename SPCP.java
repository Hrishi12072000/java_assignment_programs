import java.util.Scanner;

public class javaprogram4
{
     public static void main(String args[])
    {
      int num1,num2,SP,CP,res;
      
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Enter two numbers:");
      num1=scanner.nextInt();
      num2=scanner.nextInt();

      SP=num1;
      CP=num2;
      res=num1-num2;

      System.out.println("profit on product="+ res);
     
      ;
     }
}
