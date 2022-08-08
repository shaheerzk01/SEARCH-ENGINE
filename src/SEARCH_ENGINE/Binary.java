package SEARCH_ENGINE;

public class Binary {
	
	public int binary(int[] arr, int element_to_search) {
		
		int firstindex = 0;
		int lastindex = arr.length ;
		
		// termination condition (element isn't present)
		while(firstindex <= lastindex) {
			int middleindex = firstindex + (lastindex - firstindex) / 2;
			// if the middle element is our goal element, return its index
			if(arr[middleindex] == element_to_search) {
				return middleindex;
			}
			// if the middle element is smaller
		    // point our index to the middle+1, taking the first half out of consideration
			else if(arr[middleindex] < element_to_search) {
				firstindex = middleindex + 1;
			}
			// if the middle element is bigger
	        // point our index to the middle-1, taking the second half out of consideration
			else if(arr[middleindex] > element_to_search) {
				lastindex = middleindex -1;
			}
		}
		
		return -1;
	}
	

}
