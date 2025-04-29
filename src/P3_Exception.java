import java.io.*;
import java.io.FileOutputStream;

public class P3_Exception {
	//This Program makes Mukesh.txt file at specified path 
	public static void main(String[] args)throws FileNotFoundException,Exception {
		// TODO Auto-generated method stu
		String file ="C:\\Users\\msurywan\\Desktop\\Mukesh.txt";
		FileOutputStream obj =new FileOutputStream(file);
//		System.out.println(obj);
	}
	
	// We can handle this exception with the help of try catch block also 

}
