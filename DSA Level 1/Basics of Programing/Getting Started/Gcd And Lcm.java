import java.util.*;
    
public class Main 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int lcmAnswerNumerator = num1*num2;

    // Runs till final remainder becomes zero
    while(num1 % num2 !=0)
    {
      int remainder = num1 % num2;
      num1 = num2;
      num2 = remainder;
    }
    int gcdAnswer = num2;
    System.out.println(gcdAnswer);

    int lcmAnswer =  lcmAnswerNumerator/gcdAnswer;
    System.out.println(lcmAnswer);
  }
}
