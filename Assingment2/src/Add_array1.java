import java.util.Scanner;

public class Add_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size=sc.nextInt();
		int a[]=new int[size];
		int c[];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
        a[i]=sc.nextInt();
		
		}
		
		System.out.println("Enter the size of array 2");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size1;i++)
		{
        b[i]=sc.nextInt();
		}
		int l1=a.length;
		int l2=b.length;
		int l3=l1-l2;
		if(l1>l2)
			{c=new int [size];
			for(int i=0;i<l2;i++)
			{
				c[i]=a[i]+b[i];
				//System.out.print(" "+c[i]);
			}
			for(int m=l2;m<l1;m++)
			{
					c[m]=a[m];

			 }
				for(int i=0;i<l1;i++)
				{
					//c[i]=a[i]+b[i];
					System.out.print(" "+c[i]);
				}
		}
			     

		
		
	}}
