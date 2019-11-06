
public class Reverse {

	public static void main(String[] args) {
		 
		// given string tell weather it is palindrome or not..
		 
		//ashok  to kohsa  (not a palindrom)
		
		String s = "Madam";
		String d= "";
		 for(int i =s.length()-1; i>=0; i--)
		 {
			  d= d+ s.charAt(i);  // to concatenate two strings we have to use + operator ....
		 }
		
		
		 System.out.println();
	 if(s==d)
	 {
		 System.out.println("is a palindrom");
	 }
	 else
	 {
		 System.out.println("not a palindrom");
	 }
	}
	

	}

