import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		
        int n=sc.nextInt();
        int sum=0;
        System.out.println("Enter the elements");
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar[i]=sc.nextInt();
        	
        }
        for(int j=0;j<n;j++)
        {
        	 sum=sum+ar[j];
        }
        System.out.println("The sum of array is"+sum);
	}
	

}
