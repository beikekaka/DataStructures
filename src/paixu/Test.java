package paixu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] ={9,8,7,6,5,5,4,3,2,1};
		int[] a={3,2,4,5};
		//ц╟ещ
//		for(int i=a.length-1;i>=0;i--){
//			bSort(a, i);
//			show(a);
//		}
		
//		for(int i=1;i<a.length;i++){
//			iSort(a, i);
//			show(a);
//		}
		
		for(int i=0;i<a.length;i++){
			cSort(a, i);
			show(a);
		}

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void bSort(int[] a,int k){
		int temp;
		for(int i=0;i<k;i++){
			if(a[i]>a[i+1]){
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	} 
	
	public static void iSort(int[] a,int k) {
		
		for(int i=0;i<=k;i++){
			if(a[i]>=a[k]){
				int temp=a[k];
				for(int j=k-1;j>=i;j--){
					a[j+1]=a[j];
				}
				a[i]=temp;
			}
		}
		
		
	}
	
	public static void cSort(int[] a,int k){
		int p=k;
		for(int i=k+1;i<=a.length-1;i++){
			if(a[i]<=a[p]){
				p=i;
			}
		}
		int temp=a[p];
		a[p]=a[k];
		a[k]=temp;
	}

}
