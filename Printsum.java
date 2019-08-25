import java.util.Scanner;
class Printsum
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	int Y=scan.nextInt();
	int i=X+Y;
	if(i%2==0)
	{
		System.out.println("The given no is even  "+i);
	}
	else
	{
		System.out.println("The given no is odd  "+i);
	}
	}
}
