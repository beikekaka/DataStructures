package paixu;



public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={6,5,4,3,2,1,7,8,9};
		mergeSort(a, 0, a.length-1);
		show(a);

	}
	
	public static void merge(int[] a,int begin,int mid,int end){
		int[] temp=new int[end-begin+1];
		int i=begin;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=end){
			if(a[i]<=a[j]){
				temp[k++]=a[i++];
			}
			else{
				temp[k++]=a[j++];
			}
		}
		while(i<=mid){
			temp[k++]=a[i++];
		}
		while(j<=end){
			temp[k++]=a[j++];
		}
		for(int ii=0;ii<temp.length;ii++){
			a[begin+ii]=temp[ii];
		}
	}
	
	public static void mergeSort(int[] a,int begin,int end){
		int mid=(begin+end)/2;
		if(begin<end){
			mergeSort(a, begin, mid);
			mergeSort(a, mid+1, end);
			merge(a, begin, mid, end);
		}
	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");			
		}	
		System.out.println();
	}
	
	

}
