import java.util.Scanner;
import java.util.*;

public class first01 {
	public static void main(String args[])
	{
		System.out.println("Hello, Your username is 'im'.");
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your username");
		String a= in.nextLine();
		if(a.equals("im"))
		{
			System.out.println("Welcome!!");
		}
	}


}
