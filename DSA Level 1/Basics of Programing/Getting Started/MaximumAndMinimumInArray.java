package Arrays;
import java.util.Scanner;

public class MaximumAndMinimumInArray 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n = sc.nextInt();
		
		int A[] = new int[n];
		System.out.print("Enter elements of the array : ");
		for(int i=0; i<n; i++)
		{
			A[i] = sc.nextInt();
		}
		
		int max = A[0];
		int min = A[0];
		for(int i=0; i<n; i++)
		{
			if(A[i]>max)
			{
				max = A[i];
			}
			else if(A[i]<min)
			{
				min = A[i];
			}
		}
		System.out.print("Maximum number in array is : " + max);
		System.out.print("\nMinimum number in array is : " + min);
	}
}