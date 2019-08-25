import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int X=scan.nextInt();
int r=0;
int Y=0;
while(X!=0){
	Y=X%10;
	r=r*10+Y;
	X=X/10;
}
System.out.print(r);
if(r==X){
	System.out.print("Palindrome");
}
else{
	System.out.print("NOt Palindrome");
}
}
}
