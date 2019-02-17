import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner scan= new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2=scan.nextLine();
    int len1 = str1.length();
    int len2 = str2.length();
    int count = 0;
    for(int i = 0;i<(len1-len2)+1;i++)
    {
      boolean ismatching=true;
    	for(int j=0;j<len2;j++)
        {
        if(str1.charAt(i+j)!=str2.charAt(j))
          ismatching=false;
        }
      if(ismatching==true)
        count++;
    }
    System.out.println(count);
      
      
  } 
}