import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<(n-1); i++)
      arr[i]=sc.nextInt();
    int sum = 0;
    int sum1 = 0;
    
    for(int j=0 ;j<=(n-1);j+=3)
    {
    sum=arr[j]+arr[j+1]+arr[j+2];
      sum1 =arr[j+3]+arr[j+4]+arr[j+5];
      
      
      if(sum1!=sum){
        System.out.println("Not a Perfect Batch");
        break;
      }
        else if(sum==sum1){
          System.out.println("Perfect Batch");
      break;
        }
    }
    
  }
}