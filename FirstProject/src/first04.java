import java.util.Scanner;

public class first04 {
	public static void main(String args[])
	{
		System.out.println("To know, is it legal to marry now? \nEnter your gender(M or F)");
		Scanner i= new Scanner(System.in);
		String a=i.nextLine();
		if(a.equals("M"))
		{
			System.out.println("Enter your age");
			int age= i.nextInt();
			if(age>=21)
			{
				System.out.println("You are legally allowed!");
			}
			else
			{
				System.out.println("You are not legally allowed!");
			}
		}
		else if(a.equals("F"))
		{
			System.out.println("Enter your age");
			int age= i.nextInt();
			if(age>=18)
			{
				System.out.println("You are legally allowed!");
			}
			else
			{
				System.out.println("You are not legally allowed!");
			}
		}
		else
		{
			System.out.println("Enter valid gender in capital.");
		}
	}

}
