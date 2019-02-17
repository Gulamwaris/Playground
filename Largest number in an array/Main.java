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
      int largest=0;
      for(int j=0; j<=size-1;j++)
      {
      if(arr[j] > largest)
        largest=arr[j];
      }
      System.out.println(largest);
    }
}