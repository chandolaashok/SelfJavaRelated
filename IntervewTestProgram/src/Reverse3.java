
public class Reverse3 {

	public static void main(String[] args) {
		
		
		String str="collaboration";
		String e= "";
		
		for(int i=str.length()-1; i>=0; i-- )
		{
		      e = e+str.charAt(i);
		}
	 System.out.println(e);
	
	
	if(str==e)
	{
		
	
 System.out.println("is a palindrom");
 

	}

	else
	{
		 System.out.println("is not a palindrom");
	}
}
}