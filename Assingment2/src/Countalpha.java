import java.util.Arrays;
import java.util.Scanner;

public class Countalpha {

	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int a[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&& str.charAt(i)<=90)
			{	
			a[str.charAt(i)-65]++;
			}
		   else if(str.charAt(i)>=97 && str.charAt(i)<=122)
		{
			a[str.charAt(i)-97]++;
		}}
		
		for(int i=0;i<26;i++)
		{
			if(a[i]==0)
			{
				continue;
			}else
			System.out.println((char)(i+97)+" "+a[i]);
		}
		//System.out.println(Arrays.toString(a));
	}
}


