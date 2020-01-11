import java.util.Scanner;

public class Leaders {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
        a[i]=sc.nextInt();}
		int temp;
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{ if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;}
			}
		}
		for(int i=0;i<size;i++)
		{
        System.out.println(a[i]);}
	}

}
