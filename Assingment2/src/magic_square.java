import java.util.Scanner;

public class magic_arr {
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int sum=0;
		int sr=0,src=0;
		int a[][]=new int[row][col];
		System.out.println("Enter the elements of array 1");
		
		 for (int i = 0; i <row; i++) 
		 { for (int j = 0;j<col; j++) 
		 {
			 a[i][j]=sc.nextInt();
		 }
		 
		 }
		 row=col;
		 int rsum[]=new int[row];
		 int csum[]=new int[row];
		 int dsum[]=new int[row];
 
  //int csum=0;

	for (int i = 0; i <row; i++) 
	 { for (int j = 0;j<col; j++) 
		 {rsum[i]=rsum[i]+ a[i][j];
		 }
	 }
	for (int i = 0; i <col; i++) 
	 { for (int j = 0;j<row; j++) 
		 {csum[i]=csum[i]+ a[i][j];
		 }
		 }
		
		 for (int i = 0; i<row; i++) 
		 { for (int j = i;j<col; j++) 
		 {
		 
		
		 if (row==col)
		 {
			 src=src+ a[i][j];}}
			
		 }
		 int flag=0;
		 for(int i=0;i<row;i++)
		 {
			 int tem=rsum[0];
			 if(tem!=rsum[i]||tem!=csum[i]||tem!=sr||tem!=src)
			 {
				 flag=1;
				 continue;
			 }
			 
		 }
		 
	if(flag==0)
		System.out.print("Success");
		else
			System.out.print("Failure");
	}
	
}