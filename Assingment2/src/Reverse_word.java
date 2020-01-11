
public class Reverse_word {

	public void rev(String str)
	{ 
		String []words=str.split(" ");
		String revs="";
		int counter=0;
		for(int i=0;i<words.length;i++)
		{
			counter=0;
			String word=words[i];
			String revw="";
			
			if(!(word.charAt(0)>=48 && word.charAt(0)<=57))
			{
			       for(int j=word.length()-1;j>=0;j--)
			       {
			    	   revw=revw+word.charAt(j);
			    	   
				}
			       counter=1;
			}
			if(counter==1)
		   revs=revs+" "+revw;
			else
				revs=revs+" "+word;
		   }
		System.out.println(str);
		   System.out.println(revs);
		}
		
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Reverse_word a=new Reverse_word();
       a.rev("the sky is blue 123 arar");
	}

}
