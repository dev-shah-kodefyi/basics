import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first name");
		Scanner sc=new Scanner(System.in);
		String first=sc.nextLine();
		System.out.println("Enter the second name");		
		String middle=sc.nextLine();
		System.out.println("Enter the last name");
		String last=sc.nextLine();
		System.out.println("Enter the age");
		int n=sc.nextInt();
		String f1="";
		//int x= first.length();
		f1+=first.charAt(0);	
		f1+=middle.charAt(0);
		f1+=last.charAt(0);
		f1+=""+n;
		
		System.out.println(f1);


}}
