package Progrm;


import java.util.*;

public class Pro2 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter n the size of the array");
		int size=s1.nextInt();
		int arr[]=new int[size];
		System.out.println("enter"+ size +"elements");
		for(int i=0; i<arr.length; i++)
		{
		  arr[i]=s1.nextInt();	
		}

		System.out.println("output...>"+ Strong(arr));

		
	}

	private static int[] Strong(int[] arr) {
		int sum = 0;
		ArrayList a1=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			int temp=arr[i];
			while(temp!=0)
			{
				int rem=temp%10;
				sum=sum+fact(rem);
				temp=temp/10;
			}
			
		}
		int i = 0;
		if(sum==arr[i])
			a1.add(arr[i]);
		{
			int brr[]=new int[a1.size()];
			for (int i1 = 0; i1 < brr.length; i1++) {
				brr[i1]=(int)a1.get(i1);
				
			}
			int   res[] = { 0 };
			if(a1.size()==0)
				return res;
			else 
				return brr;
		}
	}
	
	
	
	 static int fact(int num) {
	int fact1=1;
	for(int i=num;i>=1;i--)
	{
		fact1=fact1*i;
	}
	 return fact1;
	}
}

	
		
	


