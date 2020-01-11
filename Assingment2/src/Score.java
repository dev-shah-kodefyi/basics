import java.util.Scanner;

public class Score {

	public static void marks(int arr[])
	{int c;
	for(int i=1;i<=10;i++)
	{c=0;
		for(int j=2;i<=10;i++)
		{
			if(arr[i]==arr[j])
			{
				c++;			
			}
			else {
				
			}
		
	 System.out.println("no of student scored "+arr[i]+"marks"+c);}
		}
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int a[]=new int[10];
		System.out.println("Enter the array");
          //int size=10;
		for(int i=1;i<=10;i++)
		{
			a[i]=sc.nextInt();
		}
       
          marks(a);
	}

}
