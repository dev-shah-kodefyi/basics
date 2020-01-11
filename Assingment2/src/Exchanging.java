import java.util.Scanner;

public class Exchanging {

	public static void main(String[] args) {
		
		System.out.println("Enter the full name");
		Scanner sc=new Scanner(System.in);
	
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		int x= str1.length();
		int index1=str1.lastIndexOf(" ");
		String subaq=str1.substring(0,index1);
		String sub=str1.substring(index1+1,x);
		
		int y= str2.length();
		int index2=str2.lastIndexOf(" ");
		String subj=str2.substring(0,index2);
		String suba=str2.substring(index2+1,y);
		
		
		System.out.println(subaq+" "+suba);
		System.out.println(subj+" "+sub);	
			}
		} 

