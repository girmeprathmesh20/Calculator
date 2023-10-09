
import java.util.Scanner;
public class ReverseString 
{
public static void main(String args[])
{
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	String s= sc.nextLine();
	String rev = "";
	char ch;
	for(i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		rev=ch+rev;  
		
	}
	System.out.println(rev);
	}
}