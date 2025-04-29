package String;

public class String_Reverse {

	public static void main(String[] args) {
		
		String name= "Moreshwar";
		String revName= "";
		
		for (int i = name.length()-1; i >=0; i--) {
			
			revName = revName+name.charAt(i);
		}
		System.out.println(name);
		
		System.out.println(revName);
		
	}
}
