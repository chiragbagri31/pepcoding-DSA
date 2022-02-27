import java.util.*;
class linearSearch 
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
    
    int found = -1;
    for(int i=0; i<n; i++)
    {
      if(a[i] == numFound)
      {
        found = i;
        System.out.print("Found at : " + found + "th index");
        break;
      }
    }  

    if(found==-1)
    {
      System.out.print(numFound + " Not Found");
    }
  }
}
