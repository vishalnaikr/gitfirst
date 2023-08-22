package Progrm;

import java.util.Iterator;

public class Arrays {
public static void main(String[] args) {
	String str[]="java mava".split(" ");
//	String arr[]=str.split(" ");
//	for (int i = arr.length; i >=0 ; i--) {
//		System.out.println(arr[i]);
//	}
String str2="";
for (int i = str.length-1; i>=0; i--) {
	if(i<1) {
		str2=str2+(str[i])+" ";
	}else {
			str2=str2+(str[i]);	
		}
			
	}
System.out.println(str2);
}

//private static String rev(String str) {
//	// TODO Auto-generated method stub
//	String rev="";
//	for (int i =str.length()-1; i >=0; i--) {
//		rev=rev+str.charAt(i);
//	}
//	
//	return rev;
//}

}


