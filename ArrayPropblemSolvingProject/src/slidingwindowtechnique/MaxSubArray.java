package slidingwindowtechnique;

public class MaxSubArray {
	
	// Time Complexity - O(n^2)
	static int findMaxSumUsual(int[] arr, int n, int k) {
		int maxSubarraySum = Integer.MIN_VALUE;
		for(int i=0;i<n-k + 1;i++ ) {
			int currentSum = 0;
			for(int j=0;j<k;j++) {
				currentSum = currentSum + arr[i+j];
			}
			maxSubarraySum = Math.max(currentSum, maxSubarraySum);
		}
		return maxSubarraySum;
	}
	
	// time complexity - O(n)
	static int findMaxSumSlidingWindowTechnique(int[] arr, int n, int k) {
		int maxSubarraySum = 0;
		
		for(int i=0;i<k;i++) {
			maxSubarraySum += arr[i];
		}
		
		int windowSum = maxSubarraySum;
		for(int i=k;i<n;i++) {
			windowSum += arr[i] - arr[i-k];
			maxSubarraySum = Math.max(maxSubarraySum, windowSum);
		}
		return maxSubarraySum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,6,2,4,1};
		int k = 3;
		int n = arr.length;
		int result = findMaxSumUsual(arr, n, k);
		System.out.println("Max Sum:" + result);
		
		int result2 = findMaxSumSlidingWindowTechnique(arr, n, k);
		System.out.println("Max Sum2:" + result2);
	}

}
