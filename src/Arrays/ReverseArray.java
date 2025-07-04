package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int []temp=new int[arr.length];
		
		for (int i =arr.length-1; i >=0 ; i--) 
		{
			temp[arr.length-1-i]=arr[i];
			
		}
		
		
		System.out.println(Arrays.toString(temp));
		System.out.println();
		
		/*
				next approch using only one array 
		*/		
		
		
		int start=0, end=arr.length-1;
		
		while (start<end) {
			
			int temp1=arr[start];
			arr[start]=arr[end];
			arr[end]=temp1;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
