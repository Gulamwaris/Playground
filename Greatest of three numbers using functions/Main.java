import java.util.Scanner;





class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
       int n1 = in.nextInt();
       int n2 = in.nextInt();
       int n3 = in.nextInt();
      System.out.println(great(n1,n2,n3));
      
	}
  public static int great(int a , int b , int c)
{
  if(a>b && a>c)
    return a;
    else if(b>a && b>c)
      return b;
      else
        return c;

}
}