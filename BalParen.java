import java.util.*;
class BalParen
{
  public static void main(String[] args)
  {
String str ="[]{} ";
   int c=0,s=0,a=0;
   int count=0;
   int counts=0;
   for(int i=0;i<str.length();i++)
   {
    char ch=str.charAt(i);
	if(ch=='[')
	 c+=1;
	 else if(ch==']')
	 c-=1;
	 else if(ch=='{')
	 s+=1;
	 else if(ch=='}')
	 s-=1;
     else if(ch=='(')
	 a+=1;
     else if(ch==')')
	 a-=1;
     }
	 if(c==0&&s==0&&a==0)
     System.out.println("balanced");
     else 
	 System.out.println("not balanced");
	 }
	 }
