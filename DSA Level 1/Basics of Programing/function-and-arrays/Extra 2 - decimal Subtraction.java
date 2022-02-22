package pepCodingDSA;
import java.util.Scanner;

public class decimalSubtraction 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Second number : ");
		int n2 = sc.nextInt();
		
		int borrow = 0;
		int res = 0;
		int power = 0;
		
		while(n1>0 || n2>0 || borrow>0)
		{
			int sub = (borrow + n1%10) - n2%10;
			n1 = n1/10;
			n2 = n2/10;
			
			if(sub<0)
			{
				sub = sub + 10;
				borrow = -1;
			}
			else
			{
				borrow = 0;
			}
			
			res = res + sub * (int)Math.pow(10, power);
			power++;
		}
		System.out.println("Result : " + res);
	}
}
