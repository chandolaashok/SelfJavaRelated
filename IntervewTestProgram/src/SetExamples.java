import java.util.HashSet;
import java.util.Iterator;

public class SetExamples {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Nepal");
		hs.add("india");
		hs.add("bihar");
		hs.add("USA");
        System.out.println(hs.isEmpty());// false or true...
     //   hs.removeAll(hs);
        System.out.println(hs);
       
        //System.out.println(hs.size());
	// iterator is an interface in hashSet
        
       Iterator<String> it =hs.iterator();
       if(it.hasNext())
       { for(int i =0; i<hs.size(); i++ )
       {
    	
    	   System.out.println(it.next());
       }
       }
       
	}
	

}
