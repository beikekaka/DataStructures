package paixu;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,4,2,3,4,5,6,7};
		for(int k=1;k<a.length;k++){
			insertSort(a, k);
			show(a);
		}

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//把第k个元素融入到前边有序队列
	public static void insertSort(int[] a,int k){
		for(int i=0;i<k;i++){
			if(a[k]<=a[i]){
				int temp=a[k];
				for(int j=k-1;j>=i;j--){
					a[j+1]=a[j];
				}
				a[i]=temp;
			}
		}
	}

}
