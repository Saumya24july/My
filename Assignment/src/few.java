import java.util.Scanner;

public class few {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int i=1;i<=7;i++)
	{
		for(int j=1;j<=7;j++)
		{
			if(i==1 || j==1 || i==2 || i-j==1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	}}