package Progrm; 


import java.util.*;

public class Pro1 {
	

	private static int[] ans;

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter nthe size of the array");
		int size=s1.nextInt();
		int arr[]=new int[size];
		System.out.println("enter" + size + "elements");
		for(int i=0; i<arr.length; i++)
		{
		  arr[i]=s1.nextInt();	
		}
		
		System.out.println("output...>"+ Xylem(arr));
		
	}

	private static ArrayList Xylem(int[] arr) {
		
	ArrayList a1=new ArrayList<>();
	
	for (int i = 0; i < arr.length; i++) {
		int copy=arr[i];
		while(copy>9)
		{ int sum=0;
		while(copy!=0){
				int d=copy%10;
				sum=sum+d*d;
				copy= copy/10;
				
			}
copy=sum;
		
		}
	
		if(copy==1 || copy==7)
		a1.add(arr[i]);
	}
	int res[]= {-1};
	int ans[] =new int[a1.size()];

	if(a1.size()==0) {
		a1.add(-1);
		return a1;
	}
		
	else
	return a1; 
     
	}

}
