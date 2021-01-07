import java.util.Scanner;

public class first06 {
	public static void main(String args[])
	{
		System.out.println("Enter a no. to find factor");
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		int m=1;
		while(n!=0)
		{
			m= m*n;
			n--;
		}
		System.out.println("Factor is "+m);
	}
}
