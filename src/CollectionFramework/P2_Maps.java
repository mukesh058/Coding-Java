package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class P2_Maps {

	public static void main(String[] args) throws Exception {
		
		HashMap<Integer, String> hm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
		hm.put(4,"E");
		hm.put(5,"F");
		
		
		System.out.println(hm);
		System.out.println("Size of Map is :  "+hm.size());
		
		HashMap<Character, String> hp=new HashMap<>();
		hp.put('M', "Mukesh");
		hp.put('S',"Suryawanshi");
		System.out.println(hp.get('S'));
		System.out.println(hp.containsValue("Mukesh"));
		
		

	}

}
