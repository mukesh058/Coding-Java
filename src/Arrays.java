public class Arrays {

    public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 
		  System.out.println("Length of arr: " + arr.length);
		  
		  int[] a = new int[5]; 
		  System.out.println("Length of a: " + a.length);
		  
		  // Copy elements from arr to a 
		  for (int i = 0; i < a.length; i++) 
		  { a[i] =  arr[i]; }
		  
		  // Print elements of array a
		  for (int n = 0; n < a.length; n++) {
		  System.out.println(a[n]);
		  }
		 
    	try {
    		int n[] =null;
        	System.out.println(n.length);//NullPointerException: Cannot read the array length because "n" is null
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
