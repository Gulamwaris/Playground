import java.util.Scanner;
import java.lang.Math;
class Main{
  
  public static int power(int m,int n){
    int g=1;
   for(int i =0;i<n;i++)
   {
   g=g*m;
   }
    return g;
  }
  
  
  
  
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    int e = in.nextInt();
    int res=power(b,e);
    b=res;
    System.out.println(b);
    
  }
}
