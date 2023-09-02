package manju.learning.arrays;

public class ReverseArray {
	
	public int[] reverse(int [] array) {
		int [] reverseArray = new int[array.length];
		int idx=0;
		long start= System.nanoTime();
		for(int i = (array.length -1) ; i>=0; i--) {
			reverseArray[idx] = array[i];
			idx++;
		}
		long end= System.nanoTime();
		System.out.println("reverse took " +  (end-start) + " ns");
		return reverseArray;
		
	}
	
	public static void reverseArr( int[] arr, int start, int end ){
        while( start<end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
                end--; start++;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        len--;
        reverseArr(nums, 0, len);
    }

}
