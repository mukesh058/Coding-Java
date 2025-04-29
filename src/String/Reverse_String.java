package String;

public class Reverse_String {

	public static void main(String[] args) {
		// reverse string with spaces 
		
		String name= " Java code ";
		
		String[] words = name.split(" ");
		String str="";
//		
//		for (String word : words) {
//			
//		
//		for (int i =word.length()-1; i>=0; i--) {
//			
//			str+=word.charAt(i);
//		}
//		
//
//		System.out.println(str);
//		}
		
		
		
		
		for(int i=words.length-1;i>=0;i--)
		{
			str=str+words[i]+" ";
			
		}
		System.out.println(str);
	}
		

}
