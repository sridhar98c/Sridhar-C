import java.util.Scanner;
class Unittwoevenodd
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	int Y=scan.nextInt();
	int i=X%10;
	int j=Y%10;
	int h=i+j;
	if(h%2==0)
	{
		System.out.println("The given no is even  "+h);
	}
	else
	{
		System.out.println("The given no is odd  "+h);
	}
	}
}
