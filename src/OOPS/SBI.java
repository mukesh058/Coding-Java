package OOPS;

public class SBI extends Bank{
	
	public int rateOfInterest()
	{
		return super.ROA=8;
		
	}

	public static void main(String[] args) {
		
		SBI bank = new SBI();
		System.out.println("Rate of Interest Of SBI is :  "+bank.rateOfInterest());
		
		Bank obj = (Bank)bank;
		
		System.out.println(obj.rateOfInterest());
		
	}
}
