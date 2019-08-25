import java.util.Scanner;
class Functiontwo{
	int isEven(int X){
		if(X%2==0)
			return 2;
		else
			return 1;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Functiontwo obj=new Functiontwo();
		int a=scan.nextInt();
		int b=0;
		b=obj.isEven(a);	
		System.out.println(b);
	}
}
