
public class Validation {

	public static void main(String[] args) {
		String usn ="1DS19CS010";
		int l=usn.length();
		System.out.print(l);
		if(usn.charAt(0)=='1' || usn.charAt(0)=='2')
		{
			if(usn.charAt(1)>='A'&& usn.charAt(1)<='Z')
			{
				if( usn.charAt(2)>='A'&& usn.charAt(2)<='Z')
			{
				if(usn.charAt(3)>='0'&& usn.charAt(4)<='9')
				{ 
					String str=usn.substring(5,6);
					str=str.toUpperCase();
					if(str.equals("CS")||str.equals("IT")||str.equals("EC")||str.equals("ME"))
					{
						for(int i=7;i<10;i++)
						{
							
						
						if(usn.charAt(i)>='0'&& usn.charAt(i)<='9')
						{
							//if(usn.charAt(9)>='0' && usn.charAt(9)<='9')
							
						}
						  else 
						  System.out.println("Failure");}}
						  else
						  System.out.println("Failure");}
					      else
						  System.out.println("Failure");}
					      else
						  System.out.println("Failure");}
					      else 
						  System.out.println("Failure");}
					
	}	}