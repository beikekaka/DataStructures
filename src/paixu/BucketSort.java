package paixu;

import java.util.ArrayList;
import java.util.Collections;




public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,3,1,3,4,5,6,7,8,99,76,3};
		bucketSort(a);

	}
	
	public static void bucketSort(int[] arr){
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);
		}
		
		//Ͱ��
		int bucketNum = (max-min)/arr.length +1;
		ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
		for(int i=0;i<bucketNum;i++){
			bucketArr.add(new ArrayList<Integer>());
		}
		
		//��ÿ��Ԫ�ط���Ͱ
		for(int i=0;i<arr.length;i++){
			int num = (arr[i]-min)/arr.length;
			bucketArr.get(num).add(arr[i]);
		}
		
		//��ÿ��Ͱ��������
		for(int i=0;i<bucketArr.size();i++){
			Collections.sort(bucketArr.get(i));
		}
		
		System.out.println(bucketArr.toString());
	}

}
