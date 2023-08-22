package Progrm;

import java.util.Scanner;

public class Pro11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int copy=n;
		int sum=0;
		while(n!=0)
		{
			int base=n%10;
			sum=sum+power(base,count(n));
			n=n/10;
		}
		if(copy==sum)
		{
			System.out.println("it is a desirium");
		}else
		{
			System.out.println("it is not a desirum number");
		}
	}

	private static int power(int base, int count) {
		int ree=1;
		while(count!=0)
		{
			ree=ree*base;
			ree--;
		}
		return ree;
	}

	private static int count(int n) {
		int count=0;
		while(n!=0)
		{
			n=n%10;
			count++;
		}
		
		return count;
	}

}
