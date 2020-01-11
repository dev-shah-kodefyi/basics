import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,s,num;
		r=0;
		s=0;
		System.out.println("Enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		num=n;
		
		while(num!=0)
		{	
		r=num%10;
		s=(s*10)+r;
				
		num=num/10;
		
		}
		System.out.println("Reverse of no is"+s);
		//Scanner sc=new Scanner(System.in);
		
	}

}
