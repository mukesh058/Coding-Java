package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class P1_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		list.add("Mukesh");
		list.add(1999);
		list.add(2025);
		list.add("Capgemini");
		System.out.println(list.size());
		
		for (char ch = 'a'; ch <='z'; ch++) {
			
			list.add(ch);
			
		}
		System.out.println(list.size());
		System.out.println(list.contains('m'));
		System.out.println(list.get(25));


//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//for -each loop 
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		
	}

}
