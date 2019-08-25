import java.util.Scanner;
class Oddoreven
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	if(X%2==0)
	{
		System.out.println("The given no is even  "+X);
	}
	else
	{
		System.out.println("The given no is odd  "+X);
	}
	}
}
