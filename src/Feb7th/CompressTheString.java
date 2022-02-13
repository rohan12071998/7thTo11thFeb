package Feb7th;

import java.util.Scanner;

public class CompressTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next
				();
		String s="";
		/*for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)==' ') { 
				continue;
			}
			s=s+str.charAt(i);
		}
		System.out.println(s);*/
		s=str.replaceAll(" ", "");
		System.out.println(s);
		
		

		
	}
	

}
