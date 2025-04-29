
public class Reversenumber {

	public static void main(String[] args) {
		
		int num= 1518;
		int rev=0;
		while(num>0)
		{
			int temp = num%10;
//			System.out.println(temp);
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);
	}
}
