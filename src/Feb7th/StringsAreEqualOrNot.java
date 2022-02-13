package Feb7th;

import java.util.Scanner;

public class StringsAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String a=sc.next();
		
		
		String message=n.equals(a)? "Equal" :"not Equal";
		System.out.println(message);
			

	}

}
