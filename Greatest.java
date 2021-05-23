import java.util.Scanner;
public class Greatest
{
 public static void main(String[] args) 
  {
   int a,b,c,big;
   System.out.println("enter three numbers ");
   Scanner s = new Scanner(System.in);
   a = s.nextInt();
   b = s.nextInt();
   c = s.nextInt();
   big = a>b?(a>c?a:c):(b>c?b:c);
   System.out.println("greatest of three numbers =" +big);
  }
}