package Progrm;

import java.util.Arrays;
import java.util.Scanner;

public class Pro4 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter n the size of the array");
		int size=s1.nextInt();
		int arr[]=new int[size];
		System.out.println("enter" + size + "elements");
		
		for(int i=0; i<arr.length; i++)
		{
		  arr[i]=s1.nextInt();	
		}

	
		
	}

	private static void thro(int[] arr) {
	int e=10;
		int x=0;
		int brr[]=new int[arr.length+1];
		for (int i = 0; i < brr.length; i++) {
			if(i<arr.length)
			{
				brr[x]=arr[i];
				x++;
				
			}else
			{
				brr[x]=e;
			}
		}
		System.out.println(Arrays.toString(brr));
	}

}
