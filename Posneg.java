import java.util.Scanner;
class Posneg
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	if(X==0)
	{
		System.out.println("The given no is zero  "+X);
	}
	else if (X<0)
	{
		System.out.println("The given no is neg  "+X);
	}
	else
	{
		System.out.println("The given no is pos "+X);
	}
}
}
