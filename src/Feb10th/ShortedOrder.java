package Feb10th;

public class ShortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num=new int[] {4,5,8,2,9,11,1,3,56,33,22,99};
		int temp=0;
		System.out.print("Original Array= ");
		
		for (int i=0;i<num.length;i++) {
			
				System.out.print(+num[i]+" ");
			}
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Shorted");
		for(int i=0;i<num.length;i++) {
			System.out.print(+num[i]+" ");
			
		}
		
	
	}

}
