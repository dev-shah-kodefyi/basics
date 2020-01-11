import java.util.Scanner;
import java.lang.*;


public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1=" ";
		int i;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
				
		String str=sc.nextLine();
		//str=sc.nextLine();
		int x= str.length();
		for(i=0;i<x;i++)
		{
			if(i==0)
			System.out.print(str.charAt(i));
			if(str.charAt(i)==' ')
			{
				System.out.println(str.charAt(i+1));
			}
		} 

	}}

