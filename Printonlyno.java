import java.util.*;
class Printonlyno{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s="r2h6l";
		s=s.replaceALL("[a-zA-Z]","");
		System.out.print("ans:"+s);
	}
}
