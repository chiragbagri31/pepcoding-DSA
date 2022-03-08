import java.io.*;
import java.util.*;

public class Main 
{
  public static void main(String[] args) throws Exception 
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // Takes array inputs from the user
    int A[] = new int[n];
    for(int i=0; i<n; i++)
    {
      A[i] = sc.nextInt();
    } 

    // Sorts the array in ascending order
    for(int i=0; i<n-1; i++)
    {
      for(int j=0; j<n-1; j++)
      {
        if(A[j]>A[j+1])
        {
          int temp = A[j];
          A[j] = A[j+1];
          A[j+1] = temp;
        }
      }
    }

    // A[n-2] prints second largest element in the sorted array
    // A[i+1] prints second smallest element in the sorted array
    int  i=0;
    System.out.print(A[n-2] + " " + A[i+1]);  
  }
}
