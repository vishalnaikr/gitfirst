package Progrm;

import java.util.*;
public class Pro3 {

	public static void main(String[] args) {
		int arr[]= { 10,20,30,40};
		int brr[]= {20,50,60};
		int abb[]=new int[arr.length+brr.length];
		int x=0;
		for(int i=0;i<arr.length;i++)
		{
			abb[x]=arr[i];
					x++;
		}
		for (int j = 0; j <brr.length; j++) {
			abb[x]=brr[j];
			x++;
			
		}
		System.out.println(Arrays.toString(abb));
					
		}

	}


