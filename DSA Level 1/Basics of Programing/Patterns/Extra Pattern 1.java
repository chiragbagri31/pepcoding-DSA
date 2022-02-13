import java.util.Scanner;

public class pattern_36 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		int space = n/2;
		int num = 1;
		
		for(int i=1; i<=n; i++)
		{
			// for spaces
			for(int j=1; j<=space; j++)
			{
				System.out.print("\t");
			}
			
			int count;
			if(i<=n/2)
			{
				 count = i;
			}
			else
			{
				 count = n-i+1;
			}
			
			// for printing numbers
			for(int k=1; k<=num; k++)
			{
				System.out.print(count + "\t");
			}
			System.out.println();
			
			// updation
			if(i<=n/2)
			{
				space =  space-1;
				num = num+2;
			}
			else
			{
				space = space + 1;
				num = num-2;
			}
		}
	}
}
