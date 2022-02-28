import java.io.*;
import java.util.*;

public class Main
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception 
    {
        // enters n1 and a1 array elements
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<a1.length; i++)
        {
            a1[i] = sc.nextInt();
        } 

        // enters n2 and a2 array elements
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<a2.length; i++)
        {
            a2[i] = sc.nextInt();
        } 

        // checks wht is greater between n1 and n2
        int[] sum = new int[n1>n2 ? n1:n2];
        
        int a1EndIndex = a1.length-1;
        int a2EndIndex = a2.length-1;
        int sumEndIndex = sum.length-1;

        int carry = 0;

        while(sumEndIndex>=0)
        {
            int add = 0;
            
            add = add + carry;
            if(a1EndIndex>=0)
            {
                add = add + a1[a1EndIndex];
            }
            if(a2EndIndex>=0)
            {
                add = add + a2[a2EndIndex];
            }

            carry = add/10;
            int value = add%10;
            sum[sumEndIndex] = value;

            a1EndIndex--;
            a2EndIndex--;
            sumEndIndex--;
        }

        if(carry>0)
        {
            System.out.print(carry + " ");
        }

        for(int i=0; i<sum.length; i++)
        {
            System.out.println(sum[i]);
        }
    }
}
