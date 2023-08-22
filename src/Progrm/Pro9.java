package Progrm;

import java.util.Arrays;

public class Pro9 {

	public static void main(String[] args) {
		int arr[]= {3,5,7,8,6};
		
		int x=0;
		Arrays.sort(arr);
		int brr[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0)
			{
				brr[x]=arr[i];
				x++;
			}
		}
		for (int i = 0; i < brr.length; i++) {
			
			if(arr[i]%2==0)
			{
				brr[x]=arr[i];
				x++;
			}
			
		}
		System.out.println(Arrays.toString(brr));
	}

}
