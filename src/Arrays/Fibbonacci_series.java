package Arrays;

public class Fibbonacci_series {

	
//	fibbonacci 0+1=1,1+1=2,2+1=3,3+2=5....
	
	public static void main(String[] args) {
		
		int n=10 ; //series upto 10 
		
		int firstNum =0, secondNum=1;
		
		for (int i = 0; i < n; i++) {
			
			int res=firstNum+secondNum; //0+1 =1 , now 1+1=2
					firstNum=secondNum;
					secondNum=res;
			
			
			System.out.println("the Fibbonacci series upto is "+res);
		}
		

	}

}
