package Harmon;

public class Program1 {
	
	public static void main(String[] args) {
		
		String str = "Hi my name is Mukesh Suryawanshi";
		
		 String[] arrStr = str.split(" ");
		 
		 String rev="";
		 
		 for(int i=arrStr.length-1;i>=0;i--) {
			 
			 rev=rev+arrStr[i]+" ";
			 
		 }
		 
		 System.out.println(rev);
		
	}

}
