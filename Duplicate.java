class Duplicate
{
public static void main(String[]args)
{
 int [] a = {20,5,6,3,5,20};
 for (int i=0; i< a.length; i++){
	 
 for (int j=i+1; j< a.length; j++){
	 if (a[i]==a[j]){
		 System.out.println("Duplicate::"+a[j]);
	 }
 }
 }
}
}

 