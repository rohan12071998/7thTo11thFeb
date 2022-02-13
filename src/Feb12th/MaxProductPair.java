package Feb12th;

public class MaxProductPair {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int arr[]= {3,6,7,9,22,34,12,44,2,5};
		int n= arr.length;
		MaxProductPair(arr,n);
		


	}
	public static void MaxProductPair(int[]arr,int n) {
		if (n<2) {
			//System.out.println("no pairs exist");
			return ;
		}
		int a=arr[0], b=arr[1];
		for (int i=0;i<arr.length;i++) 
			for(int j=i+1;j<arr.length;j++) 
				if(arr[i]*arr[j]>a*b) {
					a=arr[i];
					b=arr[j];
				}
		System.out.println("Max product pair="+a+" , "+b);
			
		}
}

	
	
		



