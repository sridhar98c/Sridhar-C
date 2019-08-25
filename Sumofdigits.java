import java.util.Scanner;
class Sumofdigits{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int X=scan.nextInt();
int r;
int sum=0;
while(X!=0){

	r=X%10;
    sum=r+sum;
	X=X/10;
}
System.out.println(sum);
}
}
