import java.util.Scanner;

public class first02 {
	public static void main(String args[])
	{
		System.out.println("Enter any no. to check whether it is even or odd.");
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
