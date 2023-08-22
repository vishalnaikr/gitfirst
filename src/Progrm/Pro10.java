package Progrm;

import java.util.Arrays;
import java.util.Scanner;

public class Pro10 {
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int size=s1.nextInt();
	int arr[]=new int[size];
	System.out.println("enter"+ size +"elements");
	for (int i = 0; i < arr.length; i++) {
	    arr[i]=s1.nextInt();
	    
	}
	System.out.println("enter the rotate");
	int rotate=s1.nextInt();
	System.out.println(Arrays.toString(arr));
	int ans[]=new int[arr.length];
	int x=0;
	for (int i = rotate; i < arr.length; i++) {
		  ans[i]=arr[i];
		  x++;
	} 
	for (int i = 0; i <rotate; i++) {
		  ans[i]=arr[i];
		  x++;
	}
	System.out.println("output------>"+Arrays.toString(ans));
	}

}
