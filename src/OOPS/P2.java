package OOPS;

public class P2 extends P1 {
	//Concrete method
	public void test() {
		System.out.println("+++++++++++++++Abstraction program Practice########## ");
		
	}
	
	public static void main(String[] args) {
		
		P2 obj =new P2();
		P1 obj1 = obj;  // upcasting 
		obj1.test();
	}

}
