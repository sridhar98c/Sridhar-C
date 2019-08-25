import java.util.Scanner;
class Unitevenodd
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	int Y=scan.nextInt();
	int i=X/10;
	int j=Y/10;
	int h=i%10;
	int f=j%10;
	int g=h+f;
	if(g%2==0)
	{
		System.out.println("The given no is even  "+g);
		System.out.println(g);
	}
	else
	{
		System.out.println("The given no is odd  "+g);
	}
	}
}
