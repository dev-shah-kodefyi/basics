import java.util.Scanner;

public class Greatest {

	static int  test(int a,int b,int c)
	{
		int s=c>(a>b?a:b)?c:((a<b)?a:b);
	
	    return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the nos");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int zz=test(x,y,z);
		System.out.println("The greatest is "+zz);
	}

}
