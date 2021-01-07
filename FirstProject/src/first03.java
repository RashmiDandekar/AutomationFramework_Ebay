import java.util.Scanner;

public class first03 {
	public static void main(String args[])
	{
		System.out.println("Enter 3 no.");
		Scanner i= new Scanner(System.in);
		int a= i.nextInt();
		int b= i.nextInt();
		int c= i.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater");
		}
		else
		{
			System.out.println(c+" is greater");
		}
	}

}
