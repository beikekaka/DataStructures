package paixu;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int binarySearch(int[] a,int low,int high,int key){
		if(low<=high){
			int mid=(low+high)/2;
			if(key==a[mid]){
				return mid;
			}
			else if(key>a[mid]){
				return binarySearch(a, mid+1, high, key);
			}
			else{
				return binarySearch(a, low, mid-1, key);
			}
			
			
			
		}
		return -1;
	}
	
}

