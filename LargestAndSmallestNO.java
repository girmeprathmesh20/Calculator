class LargestAndSmallestNO
{
	public static void main (String [] args)
	{
		int[] a = {2344,5,58888,653,90};
		int min, max;
		min = max = a[0];
		for (int i= 1; i< a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Small no"+ min);
		System.out.println(" Large no"+ max);
	}
}

		