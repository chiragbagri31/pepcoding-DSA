package Patterns;
import java.util.*;

public class pattern_37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		int space = n/2;
		int num = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print("\t");
			}
			
			int count = (i<=n/2+1)? i : n-i+1;
			
			for(int k = 1; k<=num; k++)
			{
				System.out.print(count + "\t");
				count = (k<=num/2) ? count - 1:count+1; 
			}
			
			if(i<=n/2)
			{
				space = space - 1;
				num = num + 2;
			}
			else
			{
				space = space + 1;
				num = num - 2;
			}
			System.out.println();
		}
	}
}
