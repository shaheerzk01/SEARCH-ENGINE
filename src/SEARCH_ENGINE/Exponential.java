package SEARCH_ENGINE;

import java.util.Arrays;

public class Exponential {
	
	public int exponential(int[] arr, int element_to_search) {
		if(arr[0] == element_to_search) {
			return 0;
		}
		if(arr[arr.length-1] == element_to_search) {
			return arr.length;
		}
		
		int range = 1;
		while(range < arr.length && arr[range] <= element_to_search) {
			range = range * 2;
		}
		
		return Arrays.binarySearch(arr, range/2, Math.min(range, arr.length), element_to_search);
		
	}
	

}
