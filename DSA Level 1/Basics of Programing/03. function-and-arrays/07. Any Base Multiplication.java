import java.util.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2)
    {
        int ans = 0;
        int power = 0;
        while(n2>0)
        {
            int digitMultiply = getSingleDigitProduct(b, n1, n2%10);
            n2 = n2/10;

            ans = getSum(b, ans, digitMultiply * (int)Math.pow(10, power));
            power++;
        }
        return ans;
    }

    public static int getSingleDigitProduct(int b, int n1, int digit)
    {
        int res = 0;
        int power = 0;
        int carry = 0;

        while(n1>0 || carry>0)
        {
            int prod = (n1%10 * (digit)) + carry;
            n1 = n1/10;

            carry = prod / b;
            prod = prod % b;

            res = res + prod * (int)Math.pow(10, power);
            power++;
        }
        return res;
    }

    public static int getSum(int b, int n1, int n2)
    {
        int carry = 0;
        int ans = 0;
        int power = 0;

        while(n1>0 || n2>0 || carry>0)
        {
            int sum = n1%10 + n2%10 + carry;
            n1 = n1/10;
            n2 = n2/10;

            carry = sum / b;
            sum = sum % b;

            ans = ans + sum * (int)Math.pow(10, power);
            power++;
        }
        return ans;
    }
}
