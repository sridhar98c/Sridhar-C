import java.util.Scanner;
class Belong
{
	public static void main ( String args[])
	{
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	if(X<40)
	{
		System.out.println(" X is below 40");
	}
	for(int i=40;i<80;i++)
	{
		if(i==X)
		{
			System.out.println(" X is between 40 and 80");
		}
	}
	}
}
