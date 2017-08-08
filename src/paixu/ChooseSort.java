package paixu;

public class ChooseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={2,1,4,2,5,7,6,8,7};
		int[] a={2,1,3,5,4,6,9};
		show(a);
		for(int i=0;i<a.length-1;i++){
			chooseSort(a, i);
			show(a);
		}

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void chooseSort(int[] a,int begin){
		int p=begin;
		for(int i=begin;i<a.length;i++){
			if(a[i]<=a[p]){
				p=i;
			}
		}
		int temp=a[p];
		a[p]=a[begin];
		a[begin]=temp;
	}

}
