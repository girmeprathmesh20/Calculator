class A
{
void ShowA()
{
System.out.println("class A merhod");
}
}
class B extends A
{
void ShowB()
{
System.out.println("class B method");
}
}
class C extends B
{
	void ShowC()
	{
		System.out.println("class C method");
	}
public static void main (String[]args)
{
B obj1=new B();
obj1.ShowA();
obj1.ShowB();	

System.out.println("=========================");
C obj=new C();
obj.ShowA();
obj.ShowB();
obj.ShowC();
}
}


		
