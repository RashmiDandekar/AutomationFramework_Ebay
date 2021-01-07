import java.util.Scanner;

public class first09 {
	public static void main(String args[])
	{
		System.out.println("Enter a no.");
		Scanner in=new Scanner(System.in);
		int n= in.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			else
			{
				System.out.println(n+"X"+i+"="+n*i);
			}
		}
	}
}
