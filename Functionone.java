  import java.util.Scanner;
  class Functionone{
	  int isAdd(int X,int Y){
	  int Z=X+Y;
	  return Z;
  }
  public static void main(String[] args){
	  Scanner scan=new Scanner(System.in);
	  Functionone obj=new Functionone();
	 int a=scan.nextInt();
	  int b=scan.nextInt();
	  int i;
	 
	  i=obj.isAdd(a,b);
	  System.out.println(i);
  }
  }
	  
