
// Multiprogramming using Thread class & Runnable interface 

public class MultiPrograming extends Thread{
	
	public void run() {
		
		int n=0;
		while (true) {
			
			System.out.println("Mukesh");
			n++;
			if(n==30)
				break;
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		MultiPrograming t= new MultiPrograming();
		t.start();
		int m=0;
		while(true)
		{
			System.out.println("Suryawanshi");
			m++;
			
			if(m==30)
				break;
		}
		
	}
}
