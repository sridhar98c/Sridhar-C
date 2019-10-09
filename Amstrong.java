import java.util.Scanner;
class Amstrong{
	public static void main(String [] args){
		Scanner scan=new Scanner (System.in);
		int A=scan.nextInt();
		int r=A;
		int c=0;
		int i;
		while(r!=0)
		{
			i=r%10;
			r=r/10;
			c=c+(i*i*i);
		}
		if(A==r)
			System.out.println(A+" is amatrong no");
		else
			System.out.println(A+" is an amstrong no");
	}
}
