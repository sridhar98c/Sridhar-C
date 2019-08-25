import java.util.Scanner;
class Reverseanumber{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int Y=scan.nextInt();
int reversed=0;
while( Y!= 0) {
            int X = Y% 10;
            reversed = reversed * 10 + X;
            Y=Y/10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
