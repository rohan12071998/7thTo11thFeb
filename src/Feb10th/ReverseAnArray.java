package Feb10th;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num=new int[]{1,2,3,4,5,6,7,8};
		System.out.println("original Array:= ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
			
		}
		System.out.println("after Reversing The Array:= ");
		for(int i=num.length-1;i>0;i--) {
			System.out.print(num[i]+" ");
		}
			
		

	}

}
