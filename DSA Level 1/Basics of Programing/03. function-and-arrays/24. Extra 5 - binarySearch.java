import java.util.*;
class binarySearch 
{  
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = sc.nextInt();

    int a[] = new int[n];
    System.out.print("Enter array elements : ");
    for(int i=0; i<n; i++)
    {
      a[i] = sc.nextInt();
    }
    
    System.out.print("Enter number to find : ");
    int numFound = sc.nextInt();

    int low = 0;
    int high = n-1;

    int found = -1;
    while(low<=high)
    {
      int mid = (low + high)/2;
      
      if(a[mid] == numFound)
      {
        found = mid;
        System.out.print("Found at : " + found + "th index");
        break;
      }
      else if(a[mid]>numFound)
      {
        high = mid - 1;
      }
      else
      {
        low =  mid + 1;
      }
    }

    if(found == -1)
    {
      System.out.print("Not Found");
    }
  }
}
