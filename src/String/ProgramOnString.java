package String;

public class ProgramOnString {

	public static void main(String[] args) {
		
		String input = "test2345auto";
		
		int sum=0;
		
		for(char c:input.toCharArray())
		{
			if(!Character.isAlphabetic(c))
			{
				
				int numbers = Integer.parseInt(String.valueOf(c));
				sum+=numbers;		
			}
		}
		System.out.print(sum);
	}
}