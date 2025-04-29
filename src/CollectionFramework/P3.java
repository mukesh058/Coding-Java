package CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javafx.print.Collation;

public class P3 {
	
//	static int countCharOccurance(String str , char ch)
//	{
//		int count=0;
//		
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==ch)
//			{
//				count++;
//			}
//		}
//		
//		return count;
//	}
	
	public static void main(String[] args) {
		
//		int count= countCharOccurance("automation", 'a');
//		
//		System.out.println(count);
		
		String str = "Automationjava";
		String newString= str.toLowerCase();
		
	
		
		HashMap<Character, Integer> hMap= new HashMap<>();
		char[] chArr = newString.toCharArray();
		
		for(char ch:chArr)
		{
			if (hMap.containsKey(ch)) {  	// check if the KEy is already in map if yes 
				hMap.put(ch, hMap.get(ch)+1);	// put that character , with its value +1 in the map so here if the 
												// value was 1 prev then it will add 1 in it 
			
			}else hMap.put(ch, 1);               // it will put that key and value update in map if not contains 
			
		}
		System.out.println(hMap);
		System.out.println("\"java\"");
		
		for (char ch : hMap.keySet()) {
			
            if (hMap.get(ch) > 1) {
                System.out.println(ch + ": " + hMap.get(ch));
            }
        }

	
		
	}

}
