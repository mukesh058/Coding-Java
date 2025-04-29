package Arrays;

public class ArrayPrograms {
	
	public static void main(String[] args) {
		
		int [] array= {8,7,6,6,9,2,8,1,19,5};
		int max= array[0];
		
		for (int i = 0; i < array.length; i++) {
			 if(array[i]>max)
			 {
				 max=array[i];
			 }
			 
		}
		
		System.out.println(max);
		
	}

}
