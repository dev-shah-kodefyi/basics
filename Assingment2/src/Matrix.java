import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int [row][col];
		int c[][]=new int [row][col];
		System.out.println("Enter the elements of array 1");
		
		 for (int i = 0; i <row; i++) 
		 { for (int j = 0;j<col; j++) 
		 {
			 a[i][j]=sc.nextInt();
		 }
		 
		 }
		 System.out.println("Enter the elements of array 2");
		 for (int i = 0; i <row; i++) 
		 { for (int j = 0;j<col; j++) 
		 {
			 b[i][j]=sc.nextInt();
		 }
		 }
		 
		  for(int m=0;m<row;m++)
		 {
			 for(int n=0;n<col;n++)
			 {
				 c[m][n]=a[m][n]+b[m][n];
			 }
		 }
		  for(int m=0;m<row;m++)
			 {
				 for(int n=0;n<col;n++)
				 {
					 c[m][n]=a[m][n]+b[m][n];
				 }
			 }
		  
		  
		 for (int aw= 0; aw <row; aw++) 
		 { for (int qa= 0;qa<col; qa++) 
		 {
			 System.out.println(c[aw][qa]+" ");
		 }
		 System.out.println();}
		 
		 
		

	}}


