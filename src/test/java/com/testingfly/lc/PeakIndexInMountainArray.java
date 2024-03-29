package com.testingfly.lc;

/**
 * 
 * Let's call an array A a mountain if the following properties hold:
 * 
 * A.length >= 3 There exists some 0 < i < A.length - 1 such that A[0] < A[1] <
 * ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] Given an array that is
 * definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i]
 * > A[i+1] > ... > A[A.length - 1].
 * 
 * Example 1:
 * 
 * Input: [0,1,0] Output: 1 
 * 
 * Example 2:
 * 
 * Input: [0,2,1,0] Output: 1 Note:
 * 
 * 3 <= A.length <= 10000 
 * 
 * 0 <= A[i] <= 10^6 
 * 
 * A is a mountain, as defined above.
 *
 */
public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr1 = {0,1,0};
		int[] arr2 = {0,2,1,0};
		
		System.out.println(peakIndexInMountainArray(arr1));
		System.out.println(peakIndexInMountainArray(arr2));

	}
	
    public static int peakIndexInMountainArray(int[] A) {
    	for(int i=0;i<A.length-1;i++) {
    		if(A[i]>A[i+1])
    			return i;
    	}
        return 0;
    }
    
    //alternate solution
    public static int peakIndexInMountainArray1(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) i++;
        return i;
    }

}
