import java.util.Scanner;

public class Prime {
	static boolean prime(int num)
	{
		boolean flag=false,f;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				flag=true;
		}
		if(flag==true)
			f=false ;
		else f=true;
		return f;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        boolean res=prime(n);
        {
        System.out.println( res);

	}

}}
