package javafsd;

public class ArrayChallenge {
	public static void main(String[] args) {
		
		 replacing();
		 sumofarray();
		 stringreverse();
	}

	private static void stringreverse() {
		String str="Hello World",res="";
			for(char x:str.toCharArray())
			{
				res=x+res;
			}
			System.out.println("Reverse string : "+res);
	}

	private static void sumofarray() {
		int sum=0,sum2=0;
		 int[] arr = {3,5,4,5,6,3,5,7};
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			for(int i1:arr) {
				sum2+=i1;
			}
		}
	}

	private static void replacing() {
		int[] arr = {3,5,4,5,6,3,5,7};
		System.out.println("The given array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==3 && arr[i]==5) {
				arr[i]=0;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}