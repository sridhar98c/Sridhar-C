import java.util.Scanner;
class Divisible
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int X=scan.nextInt();
		if (N%X==0)
		{
			System.out.println(N+" divisible by "+X);
		}
		else
		{
			System.out.println(N+" not divisible by "+X);
		}
	}
}
