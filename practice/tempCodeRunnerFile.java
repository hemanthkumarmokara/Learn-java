public class scratch {

	public static void main(String[] args) {
		int A[]= {3,8,1,4,2,7};
		System.out.println("unsorted array:");
		for(int k=0;k<6;k++) {
			System.out.print(A[k]+"-");
		}
		for(int i=0;i<5;i++) {
			int min=i;
			for(int j=i+1;j<6;j++) {
				if(A[j]<A[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=A[min];
				A[min]=A[i];
				A[i]=temp;
				
			}
		}
		System.out.println();
		System.out.println("sorted array:");
		for(int k=0;k<6;k++) {
			System.out.print(A[k]+"-");
		}

	}

}