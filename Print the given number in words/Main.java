import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      if(num==1)
        System.out.println("one");
      if(num==2)
        System.out.println("two");
      if(num==3)
        System.out.println("Three");
      if(num==4)
        System.out.println("four");
      if(num==5)
        System.out.println("five");
      if(num>5)
        System.out.println("Invalid");
	}
}