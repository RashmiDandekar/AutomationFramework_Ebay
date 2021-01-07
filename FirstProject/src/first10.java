import java.util.Scanner;

public class first10 {
	public static void main(String args[])
	{
		System.out.println("Enter a no. to create a lader");
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i); j>=0; j--)
			{           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
			System.out.println("\n");
		}
	}
}
