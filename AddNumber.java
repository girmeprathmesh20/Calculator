import java.util.Scanner;
public class AddNumber
{
public static void main(String[] args)
{
int num1, num2, result;
Scanner input = new Scanner(System.in);
System.out.println("Enter first number 1");
num1=input.nextInt();
System.out.println("Enter second number 2");
num2=input.nextInt();
input.close();
result = num1 + num2;
System.out.println(num1 + num2 + result);
}
}


