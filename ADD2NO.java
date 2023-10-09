import java.util.Scanner;
public class ADD2NO
{
	public static void main (String [] args)
	{
		int num1,num2,Result;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter number 1");
		num1 = Input.nextInt();
		System.out.println("Enter number 2");
		num2 = Input.nextInt();
		Input.close();
		Result= num1 + num2 ;
		System.out.println("num1+num2=Result");
	}
}
