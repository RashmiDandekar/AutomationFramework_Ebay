import java.util.Scanner;

public class first07 {	
		public static void main(String args[])
		{
			System.out.println("Enter a no. between 0 to 4");
			Scanner in= new Scanner(System.in);
			int n=in.nextInt();
			if(0<=n && n<=4)
			{
				do
				{
					System.out.println("Have a nice day!");
					n++;

				}while(n!=5);
			}
			else
			{
				System.out.println("You have entered a wrong no.");
			}
		}
}
