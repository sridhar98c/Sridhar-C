import java.util.Scanner;
class Greaterlesser
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	int N=scan.nextInt();
	if(X<N)
	{
		System.out.println("X is smaller than "+N );
	}
	else
	{
		System.out.println("X is greater than "+N);
	}
	}
}
