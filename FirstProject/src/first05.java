import java.util.Scanner;

public class first05 {
	public static void main(String args[])
	{
		System.out.println("Enter a no. to make it's table");
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}
