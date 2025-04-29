import java.io.FileInputStream;

public class FileInput_Reader {

	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\msurywan\\Desktop\\FileOutput.txt");
		
		byte b[] = new byte[fis.available()];
		fis.read(b);
		
		String str= new String(b);
		
		System.out.println(str);
		
		
	}
}
