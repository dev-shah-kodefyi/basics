
import java.util.List;
import java.util.Scanner;

class Unique_elements
{
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array 1");
	
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the size of array 2");
	int size2=sc.nextInt();
	int b[]=new int [size2];
	
	System.out.println("Enter the elements of array 1");
	
	 for (int i = 0; i < a.length; i++) 
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("Enter the elements of array 2");
	 for (int i = 0; i < b.length; i++) 
	 {
		 b[i]=sc.nextInt();
	 }
	 System.out.println("The Unique elements are");

	 	int counter;
	 	
        for (int i = 0;i<a.length; i++) 
        {
        	counter=0;
            for (int j =0 ; j < b.length; j++) 
            {
              if(a[i]==b[j])
              {
            	  counter++;
            	  
              }
            }
            if(counter==0)
            System.out.print(a[i]+" ");}
        for(int h=0;h<b.length;h++)
        {
        	counter=0;
        
            	for(int k=0;k<a.length;k++)
            	{
            		if(b[h]==a[k])
            		{
            			counter++;
            	}}
            	
            	
            	if(counter==0)
            	{
            		 System.out.println(b[h]+" ");
            	}
            }}}
      
            
        
        