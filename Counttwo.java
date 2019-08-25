import java.util.Scanner;
class Counttwo{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
int y=scan.nextInt();
int i;
int c=0;
int z=7;
for(i=x;i<=y;i++)
{
if(i%z==0)
{
c++;
}
}
System.out.println(c);
}
}
