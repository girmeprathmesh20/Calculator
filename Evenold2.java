import java.util.Scanner;
public class Evenold2
{
	public static void main (String [] args)
	{
		int number,remainder;
		System.out.println("Enter a interger number");
		Scanner sacn = new Scanner(System.in);
		number = sacn.nextInt();
		// sacn.close();
		remainder=number % 2 ;
		if(remainder== 0)
			System.out.println(number+"is a even num");
		else
			System.out.println(number+"is a old num");
	}
}

		