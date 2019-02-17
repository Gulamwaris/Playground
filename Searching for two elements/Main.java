import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      
      for(int i = 0 ; i<=size-1;i++)
      {
      arr[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
            int count = 0;

      for(int index = 0 ; index<=size-1;index++)
      {
        
        
      if(n1==arr[index])
      {
        System.out.println(index);
        count=1;
        break;
      }
      
          
      }
      if(count==0)
        System.out.println("-1");
      count = 0;
        for(int j = 0 ; j<=size-1;j++)
      {
        
        
      if(n2==arr[j])
      {
        System.out.println(j);
        count=1;
        break;
        
      }
      
          
      }
      if(count==0)
        System.out.println("-1");
      
      
    }
}