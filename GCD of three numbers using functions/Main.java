import java.util.Scanner;
public class Main{
  
  public static int gcd(int a, int b , int c)
  {
  int g = 0,min=0;
    if(a<b && a<c)
      min=a;
    else if(b<c && b<a)
      min=b;
      else
        min=c;
    
    
   
    if(a%min==0 && b%min==0 && c%min==0)
      g=min;
     
      else
        min--;
    
    return g;
    
  }
  
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
       int n2= in.nextInt();
       int n3= in.nextInt();
      System.out.println(gcd(n1,n2,n3));
	}
}