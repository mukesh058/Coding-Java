
public class P1_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0 ;
		try {
			int res= a/b;
			System.out.println(res);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		System.out.println("main Method End");
	}

}
