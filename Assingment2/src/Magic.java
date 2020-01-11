import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		
		int a[][]=new int[row][col];
		int sum[]=new int[row];
		
		System.out.println("Enter the elements of array 1");
		
		 for (int i = 0; i <row; i++) 
		 { for (int j = 0;j<col; j++) 
		 {
			 a[i][j]=sc.nextInt();
		 }
		 
		 }
		  for(int m=0;m<row;m++)
		 {
			 for(int n=0;n<col;n++)
			 {
				 sum[m]=sum[m]+a[m][n];
			 }
		 }
		  int flag=0;
		  for(int in=0;in<row;in++)
		  {
			  int temp=sum[0];
			  if(temp!=sum[in])
			  {
				  flag=1;
				  break;
			  }
		  }
		  if (flag==0)
		  System.out.println("Success");
		  else
			  System.out.print("Failure");}
	}


