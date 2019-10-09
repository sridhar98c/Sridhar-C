import java.util.Scanner;
class ArrayAscending{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,temp;
		System.out.println("enter the no of array required");
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		System.out.print("AscendingOrder:");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.print(a[n-1]);
	}
	
}	
			
