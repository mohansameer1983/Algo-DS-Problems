package com.sameer.algo;
/**
 * Given a list of n integers arr[0..(n-1)], determine the number of different pairs of elements within it which sum to k.
If an integer appears in the list multiple times, each copy is considered to be different; that is, two pairs are considered different if one pair includes at least one array index which the other doesn't, even if they include the same values.
Signature
int numberOfWays(int[] arr, int k)
Input
n is in the range [1, 100,000].
Each value arr[i] is in the range [1, 1,000,000,000].
k is in the range [1, 1,000,000,000].
Output
Return the number of different pairs of elements which sum to k.
Example 1
n = 5
k = 6
arr = [1, 2, 3, 4, 3]
output = 2
The valid pairs are 2+4 and 3+3.
 * @author mohan
 *
 */
public class PairSums {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[] {1, 2, 3, 4, 3};
		int k = 6;
		for (int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){
				System.out.println("arr[i] - "+ arr[i]);
				System.out.println("arr[j] - "+ arr[j]);
				int target = arr[i]+arr[j];
				System.out.println("target  - "+ target);
				if(target==k){
					System.out.println("Got target - "+ target);
					sum = sum+1;
				}
			}
		}
		
		System.out.println("sum - "+ sum);
	}

}
