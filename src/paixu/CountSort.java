package paixu;

import java.lang.Math;

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={4,5,3,1,3,4,5,6,7,8,99,76,3};
		show(a);
		int[] b=new int[a.length];
		//b=countSort1(a);
		show(b);
		countSort(a);
		show(a);

	}
	
	public static void show(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void countSort(int[] arr){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		//找出数组中的最大值和最小值
		for(int i=0;i<arr.length;i++){
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		//辅助数组help
		int[] help = new int[max-min+1];
		
		//找出每个数字出现的次数
		for(int i=0;i<arr.length;i++){
			int mapPos = arr[i] -min;
			help[mapPos]++;
		}
		
		int index = 0;
		for(int i=0;i<help.length;i++){
			while(help[i]-- > 0){
				arr[index++] = i+min;
			}
		}
	}

}
