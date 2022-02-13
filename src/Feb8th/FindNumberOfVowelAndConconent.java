package Feb8th;

public class FindNumberOfVowelAndConconent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="we are proud to be an indian";
		int vowel=0,consonent=0;
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel+=1;				
				System.out.println(vowel);
			}else if
			(ch>='a' && ch<='z') {
				consonent+=1;
				System.out.println(consonent);
				
			
		}
			
			
				
				
			
		}
		
	}

}
