import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1=0;
      int n2 =0;
      int n3=0;
      int sum=0;
      int f1=1;
        int f2=1; int f3=1;;
      
      n1 = n%10;
      n2=(n/10)%10;
      n3=((n/10)/10)%10;
      for(int i=1;i<=n1;i++)
      {
        f1=f1*i;
      }
       for(int j=1;j<=n2;j++)
      {
        f2=f2*j;
      }
       for(int k =1;k<=n3;k++)
      {
        f3=f3*k;
      }
      sum=f1+f2+f3;
     
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}