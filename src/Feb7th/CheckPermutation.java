package Feb7th;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="bca";
		if (str(str1,str2)) {
			System.out.print("yes");
		}else {
			System.out.print("no");
		}
		

	}
	public static boolean str(String str1,String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2) {
			return false;
		}
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<str1.length();i++);
		if (ch1[i] != ch2[i]) {
			return false;
			
		}
		return true ;
	}

}
