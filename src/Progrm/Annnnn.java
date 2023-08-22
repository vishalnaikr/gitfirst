package Progrm;

public class Annnnn {

	public static void main(String[] args) {
		String str="12A05j53158";
		int sum=0;
	
		for (int i = 0; i <str.length(); i++) {
			
			
				char ch=str.charAt(i);
				if(ch>='0' && ch<='9')
				
				sum=sum+(int)(ch+48);
				
			
			}
				System.out.println(sum);
		
	}

}
