package paixu;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,4,7,6,5,1};
		show(a);
		for(int i=a.length-1;i>=0;i--){
			bubbleSort(a, i);
			show(a);
		}

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] a,int k){
		int temp;
		for(int i=0;i<k;i++){
			if(a[i]>a[i+1]){
			    temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}

}
