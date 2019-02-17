import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<=(n-1);i++)
        arr[i]=in.nextInt();
      
      int count=0;
      int temp=0;
      for(int i=0;i<=(n-1);i++)
      {
      if(arr[i]!=0)
      {
      temp=arr[i];
        arr[i]=arr[count];
        arr[count]=temp;
        count++;
      }
      }
      for(int j=0;j<=(n-1);j++)
      {
      System.out.print(arr[j]+" ");
      }
      
    }
}