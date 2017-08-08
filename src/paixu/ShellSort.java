package paixu;



public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,23,23,33,4,5,6};
		show(a);
		
		shellSort(a,1);
		show(a);

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void shellSort(int[] data,int dk){
		for(int k=0;k<dk;k++){
			for(int i=1;k+i*dk<data.length;i++){
				for(int j=0;j<i;j++){
					if(data[k+j*dk]>=data[k+i*dk]){
						int temp=data[k+i*dk];
						for(int m=i;m>j;m--){
							data[m*dk+k]=data[(m-1)*dk+k];
						}
						data[dk*j+k]=temp;
					}
					
				}
			}
		}
		
		
	}
	

}
