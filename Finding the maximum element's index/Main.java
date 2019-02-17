import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<=(n-1);i++)
      arr[i]=sc.nextInt();
    int large =arr[0];
    int index=0;
    for(int j =1 ;j<=(n-1);j++)
    {
    if(arr[j]>large){
      large=arr[j];
      index=j;
    }
    }
    
    System.out.println(index);
  }
}