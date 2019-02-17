import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int rows,c,s;
      s=n;
      
      
      for (rows = 1; rows <= n; rows++)  // Loop to print rows
  {
    for (c = 1; c < s; c++)  // Loop to print spaces in a row
      System.out.print(" ");
 
    s--;
 
    for (c = 1; c <= 2*rows - 1; c++) // Loop to print stars in a row
      System.out.print("*");
 
    System.out.print("\n");
  }
    }
}
 