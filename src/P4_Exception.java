
public class P4_Exception {

	public static void vote(int age) throws Exception {
		if (age>=18) {
			System.out.println("You can vote");}
		else {
			throw new Exception("Go home Kid");
		}
	}
	public static void main(String[] args) {
		try {
		vote(10);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
