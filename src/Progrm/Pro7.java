package Progrm;

import java.util.Arrays;

public class Pro7 {

	public static void main(String[] args) {
	String s1="abcab";
	char ch[]=s1.toCharArray();
	char arr[]=new char[ch.length];
	int count = 0;
	for (int i = 0; i <ch.length; i++) {
		count=1;
	for (int j= i+1; j<ch.length; j++) {
		if(ch[i]==ch[j])
		{
		  
			arr[j]=-1;
			count++;
		}
		
	}
	
	if(arr[i]!=-1)
	{
	 arr[i]!=-1;
	}
	}
	}

}

