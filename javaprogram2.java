import java.util.Scanner;

public class javaprogram2
{
     public static void main(String args[])
    {
      int num1,num2,add,substract,multiply,divide;
      
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("Enter two numbers:");
      num1=scanner.nextInt();
      num2=scanner.nextInt();

      add=num1+num2;
      substract=num1-num2;
      multiply=num1*num2;
      divide=num1/num2;

      System.out.println("sum="+ add);
      System.out.println("difference="+ substract);
      System.out.println("multiply="+ multiply);
      System.out.println("divide="+ divide);
      
     }
}