import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int count = 0;
      int temp = num;
      int n1 = 0;
      int sum = 0;
      int n2 =0; int n3=0;
     
      while(num>0){
      
       num= num/10;
      count = count + 1; 
        
      }
      num = temp;
      
        n1=num%10;
        
         
     
      n1=n1*n1*n1;
      n2=(num/10)%10;
        n2=n2*n2*n2;
      n3=(((num/10)/10)%10);
        n3=n3*n3*n3;
        sum = n1+n2+n3;
        
        
      
      if(sum==temp)
      {
        System.out.println("Armstrong Number");
      }
      else
        System.out.println("Not a Armstrong Number");
      
      
	}
}