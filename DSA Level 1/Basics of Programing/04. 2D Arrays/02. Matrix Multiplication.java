import java.io.*;
import java.util.*;

public class Main
{   
    public static Scanner sc = new Scanner(System.in);

    // method multiplies 2 matrices
    public static void matrixMultiplication(int a1[][], int n1, int m1, int a2[][], int n2, int m2)
    {
        int resultMatrix[][] = new int[n1][m2];
        // array multiplication
        if(m1 == n2)
        {
            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<m2; j++)
                {
                    int sum = 0;
                    for(int k=0; k<m1; k++)
                    {
                        sum = sum + a1[i][k] * a2[k][j];
                    }
                    resultMatrix[i][j] = sum;
                }
            }

            // printing the array result
            for(int i=0; i<n1; i++)
            {
                for(int j=0; j<m2; j++)
                {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.print("Invalid input");
        }
    }

    // takes array elements input
    public static void getArrayInputs(int arr[][], int row, int column)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) throws Exception 
    {
        // array 1 inputs
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int a1[][] = new int[n1][m1];
        getArrayInputs(a1, n1, m1);

        // array 2 inputs
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int a2[][] = new int[n2][m2];
        getArrayInputs(a2, n2, m2);
        
        matrixMultiplication(a1,n1,m1, a2,n2,m2);
    }
}
