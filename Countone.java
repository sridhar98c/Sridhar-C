import java.util.Scanner;
class Countone{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int X=scan.nextInt();
int Y=scan.nextInt();
int i=X;
int z=7;
while(i<=Y){
i++;
if(i%z==0){
System.out.println(i);
}
}
}
}
