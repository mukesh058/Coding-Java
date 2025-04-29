package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int []temp=new int[arr.length];
		
		for (int i =arr.length-1; i >=0 ; i--) 
		{
			System.out.print(arr[i]);
			temp[arr.length-1-i]=arr[i];
			
		}
		System.out.println();
		
		System.out.println(Arrays.toString(temp));

	}

}
