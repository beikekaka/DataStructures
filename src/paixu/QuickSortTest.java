package paixu;

public class QuickSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,3,1,3,4,5,6,7,8,99,76,3};
		show(a);
		qSortTest(a, 0, a.length-1);
		show(a);

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void qSortTest(int[] a,int begin,int end){
		if(begin<end){
			int pov=a[begin];
			int i=begin;
			int j=end;
			while(i<j){
				while(a[j]>=pov&&i<j){
					j--;
				}
				while(a[i]<=pov&&i<j){
					i++;
				}
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			a[begin]=a[i];
			a[i]=pov;
			qSortTest(a, begin, i-1);
			qSortTest(a, i+1, end);
		}
	}

}
