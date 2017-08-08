package paixu;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={6,5,4,3,2,1};
		int[] a={4,5,3,1,3,4,5,6,7,8,99,76,3};
		show(a);
//		for(int i=a.length-1;i>0;i--){
//			bTest01(a, i);
//			show(a);
//		}
//		for(int i=1;i<a.length;i++){
//			iTest01(a, i);
//			show(a);
//		}
//		for(int i=a.length-1;i>0;i--){
//			cTest01(a, i);
//			show(a);
//		}
		qTest01(a, 0, a.length-1);
		show(a);

	}
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void bTest01(int[] a,int k){
		for(int i=0;i<k;i++){
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	
	public static void iTest01(int[] a,int k){
		for(int i=0;i<k;i++){
			if(a[k]<a[i]){
				int temp=a[k];
				for(int j=k;j>i;j--){
					a[j]=a[j-1];
				}
				a[i]=temp;
			}
		}
	}
	
	public static void cTest01(int[] a,int k){
		int m=0;
		for(int i=0;i<=k;i++){
			if(a[i]>a[m]){
				m=i;
			}
		}
		int temp=a[m];
		a[m]=a[k];
		a[k]=temp;
	}
	
	public static void qTest01(int[] a,int begin,int end){
		if(begin<end){
		int pov=a[begin];
		int p=begin;
		int q=end;
		while(p<q){
			while(a[q]>=pov&&q>p){
				q--;
			}
			while(a[p]<=pov&&q>p){
				p++;
			}
			int temp=a[q];
			a[q]=a[p];
			a[p]=temp;
		}
		//int temp1=a[begin];
		a[begin]=a[p];
		a[p]=pov;
		qTest01(a, begin, p-1);
		qTest01(a, p+1, end);
	}
	}
	
	public static void mTest01(int[] a,int begin,int end){
		int mid=(end+begin)/2;
		if(begin<end){
			mTest01(a, begin, mid);
			mTest01(a, mid+1, end);
			merge01(a, begin, mid, end);
		}
		
	}
	
	public static void merge01(int[] a,int begin,int mid,int end){
		int[] temp=new int[end-begin+1];
		int i=begin;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end){
			if(a[i]>=a[j]){
				temp[k++]=a[j++];
			}
			else{
				temp[k++]=a[i++];
			}
		}
		while(i<=mid){
			temp[k++]=a[i++];
		}
		while(j<=end){
			temp[k++]=a[j++];
		}
		for(int m=0;m<temp.length-1;m++){
			a[begin+m]=temp[m];
		}
		
	}

}
