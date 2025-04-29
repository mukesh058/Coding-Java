import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileOutput_Write {
	static String str;
	
	static{
		ArrayList<Character>list=new ArrayList<>();
		
	// make print a to z characters 
		
		for (char ch = 'A'; ch <='Z'; ch++) {
			//System.out.print(ch);
			
			list.add(ch);
			
				}
		//System.out.println("\n");
		
		//convert Char array to string and print
		StringBuilder sb = new StringBuilder();	
		
		for(char charlist:list)
		{
			sb.append(charlist);
		}
		FileOutput_Write.str = sb.toString();
		System.out.println(str);
	}

	public static void main(String[] args)throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\msurywan\\Desktop\\FileOutput.txt");
//		String str1= "Java Programming Practice";
		fos.write(str.getBytes());
	
		fos.close();
	
	}

	
}
