import java.io.*;
import java.util.*;

public class Main
{
    public static void printArrayDifference(int diff[], int n2)
    {
        // fnzi -> first non-zero index
        int fnzi = -1;
        for(int i=0; i<n2; i++)
        {
            if(diff[i] > 0)
            {
                fnzi = i;
                break;
            }
        }

        if(fnzi == -1)
        {
            System.out.print("0");
            return;
        }
        
        for(int i=fnzi; i<n2; i++)
        {
            System.out.println(diff[i]);
        }
    }

    public static void differenceOfTwoArrays(int a1[], int n1, int a2[], int n2)
    {
        int[] diff = new int[n2];
        
        int a1EndIndex = a1.length-1; 
        int a2EndIndex = a2.length-1;
        int diffEndIndex = diff.length-1;

        int borrow = 0;

        while(a2EndIndex>=0)
        {
            int sub =  borrow + a2[a2EndIndex];

            if(a1EndIndex>=0)
            {
                sub = sub - a1[a1EndIndex];
            }

            if(sub<0)
            {
                sub = sub + 10;
                borrow = -1;
            }
            else
            {
                borrow = 0;
            }

            diff[diffEndIndex] = sub%10;

            a1EndIndex--;
            a2EndIndex--;
            diffEndIndex--;
        }

        printArrayDifference(diff, n2);
    }

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i=0; i<a1.length; i++)
        {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0; i<a2.length; i++)
        {
            a2[i] = sc.nextInt();
        }

        differenceOfTwoArrays(a1,n1,a2,n2);
    }
}
