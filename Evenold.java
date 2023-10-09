import java.util.Scanner;
public class Evenold
{
public static void main(String[] args)
{
int number,remainder;
System.out.println("Enter the Integer number");
Scanner s = new Scanner(System.in);
number = s.nextInt();
s.close ();
remainder = number%2;
if (remainder == 0) 
	System.out.println(number+"is a even number");
else
	System.out.println(number+"is old");
}
}


