import java.util.*;
class Sum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i;
		int n=scan.nextInt();
		int count=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
	    {
         a[i]=a[i]+	a[i+1];
		}
     System.out.println(a[i]);
	}
}	
		
