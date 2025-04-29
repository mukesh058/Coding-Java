package String;

public class P1_String {
	
	
	public static void main(String[] args) {
		
		String name = "Mukesh Suryawanshi";
		//convert string to char array using toCharArray()	Method	
		char ch[]=name.toCharArray();
		
		//take help of stringbuilder class to append the reverse string 
		
		StringBuilder reversedString= new StringBuilder();
		
		//Resverse the String Program  
		for (int i =ch.length-1; i >=0; i--) {
			reversedString.append(ch[i]);   //store it as string 
			
		System.out.print(ch[i]);	
		}
	
		System.out.println("\n"+reversedString);
		
		/*
		 *apporach -2 using CharAt() method
		 *
		*/
		
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
			
		}
		/*Approach- 3  simple basic logic to reverse string 
		*/
		
		simpleRev(name);
		
	}
	
	
	
	
	
	public static void simpleRev(String str)
	{
		String reversed="";
		for (int i = str.length()-1; i >=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		System.out.println("Revversed string is :   > "+reversed);
	}

}
