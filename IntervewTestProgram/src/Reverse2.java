
public class Reverse2 {

	public static void main(String[] args) {
		
		
		
		String str= "ashok";
		String s="";
		for(int i=str.length()-1; i>=0; i--)
		{
		     s	= s+ str.charAt(i);
		}
		
		System.out.println(s);
	
	
	if(str==s)
	{
		System.out.println("string is palindrom");
		
	}
	else
	{
		System.out.println("string is not palindrom");
	}
	}
	

	}

