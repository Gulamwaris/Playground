import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count =n;
      for(int i=1;count>0;i++)
      {
        if(i%2==1)
        {
        System.out.println(i);
           count = count-1;
        }
       
      }
	}
}