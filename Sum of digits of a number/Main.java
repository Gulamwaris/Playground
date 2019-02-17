import java.util.Scanner;
class Main {
	public static void main (String[] args){
      
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1;
      int sum = 0;
      while(n>=10)
      {
        n1=n%10;
         n=n/10;
        sum = sum + n1;
      }
      sum = sum + n;
      
      System.out.println(sum);
	}
}