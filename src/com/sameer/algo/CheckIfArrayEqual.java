package com.sameer.algo;

import java.util.Arrays;

public class CheckIfArrayEqual {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,4,3,2};

		System.out.println("Equality - "+ areTheyEqual(arr1, arr2));
	}

	static boolean areTheyEqual(int[] array_a, int[] array_b) {
		Arrays.sort(array_a);
		Arrays.sort(array_b);
		if(array_a.length==array_b.length){
			for(int i=0;i<array_a.length;i++){
				if(array_a[i]!=array_b[i]){
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
