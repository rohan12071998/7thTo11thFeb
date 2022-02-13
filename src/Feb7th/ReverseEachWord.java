package Feb7th;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
			//if(str.equals(rev)) {
				
			//}
			
			
			
		}
		System.out.print(rev);
		
		

	}

}
