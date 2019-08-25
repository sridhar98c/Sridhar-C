import java .util.*;
class strngrev{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.print("enter the string to be reversed:");
String str=scan.nextLine();
String reverse="";
for(int i=str.length()-1;i>=0;i--){
reverse=reverse+str.charAt(i);}
System.out.print("the reversed string is:"+reverse);
}
}
