package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Remove_duplicates_from_string {

	public static void main(String[] args) {
		
		String str= "programming";
		
		StringBuilder sb=new StringBuilder(); // to store the string
		
		//using Set - to remove duplicates 
		
		Set<Character> charset=new LinkedHashSet<>();
		
		for (int i = 0; i < str.length(); i++) {// loop for adding str values to set 
			
			charset.add(str.charAt(i));
		}
//		System.out.println(charset);
		for (Character ch:charset) {  // for each to accesss all elements 
			
			sb.append(ch);
			
		}
		System.out.println(sb);
		
		

	}

}
