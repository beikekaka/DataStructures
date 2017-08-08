package paixu;


public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={3,2,4,3,5,7,5,8,7};
		//int[] a={3,2,1,4,5};
		int[] a={4,5,3,1,3,4,5,6,7,8,99,76,3};
		show(a);
		quickSort(a, 0, a.length-1);
		show(a);

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void quickSort(int[] a,int left,int right){
		if(left<right){
			int i=left;
			int j=right;
			int povit=a[left];
			while(i<j){				
				while(a[j]>=povit&&i<j){
					j--;
				}
				
				while(a[i]<=povit&&i<j){
					i++;
				}				

				int temp=a[i];
					a[i]=a[j];
					a[j]=temp;				
			}
			
			int temp1=a[i];
			a[i]=a[left];
			a[left]=temp1;
			
			quickSort(a, left, i-1);
			quickSort(a, i+1, right);
		}
	}

}
