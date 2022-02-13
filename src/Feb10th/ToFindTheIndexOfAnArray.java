package Feb10th;

import java.util.Scanner;

public class ToFindTheIndexOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of number=");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.print("Enter the number=");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		
			
		}
		System.out.print("Number of whome index to be found");
		int x=sc.nextInt();
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==x) {
				System.out.print("index of "+num[i]+"is ="+i);
			}
		}
		
	}

}
