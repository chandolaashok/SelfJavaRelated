import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExamp {

	public static void main(String[] args) {
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();// key value pair Key can be anything  string or integer..

		 hm.put(0, "Hello");
		 hm.put(1, "good");
		 hm.put(2, "Eve");
		 hm.put(7, "random");
		 System.out.println(hm.get(3));
		 hm.remove(0);
	Set sn= hm.entrySet(); 
	// Entry set means each key and value will be stored as an entry Set... means pairs as a set 
		 	// here sn is a set object...
	// WE are converting hashmap into set.........
	   Iterator it = sn.iterator();
	 while(it.hasNext())
	 {
		//it.next(); here since complete key value is stored in first index, so it will refer to first index.. 
		 // and point to key value pair ... present in the first index.. to print it we have to cast it with map.entry..
	     Map.Entry mp= (Map.Entry)it.next();
	     System.out.println(mp.getKey());
	      System.out.println( mp.getValue());  // here you will be able to separate key and value...
	     
	 }
	}

}
