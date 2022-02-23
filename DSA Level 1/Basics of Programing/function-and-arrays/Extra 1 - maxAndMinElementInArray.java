import java.util.Scanner;

public class maxAndMinElementInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.print("Enter array elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}	
		
		int maxElement = a[0];
		int minElement = a[0];
		for(int i=0; i<n-1; i++)
		{
			if(a[i] > maxElement)
			{
				maxElement = a[i];
			}
			
			if(a[i] < minElement)
			{
				minElement = a[i];
			}
		}
		System.out.print("Maximum element in array : " + maxElement);
		System.out.print("\nMinimum element in array : " + minElement);
	}
}
