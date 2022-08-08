package SEARCH_ENGINE;

public class Interpolation {
	
	public int[] sort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int interpolation(int[] arr, int element_to_search) {
		int startindex = 0;
		int lastindex = (arr.length-1);
		
		while((startindex <= lastindex) && (element_to_search >= arr[startindex])
				&& (element_to_search <= arr[lastindex])) {
			// using interpolation formulae to find the best probable position for this element to exist
			
			int position = startindex + (((lastindex-startindex) /
			          (arr[lastindex]-arr[startindex]))*
			                        (element_to_search - arr[startindex]));
			
			if(arr[position] == element_to_search) {
				return position;
			}
			else if(arr[position] < element_to_search) {
				startindex = position  + 1;
				
			}
			else if(arr[position] > element_to_search) {
				lastindex = position - 1;
				
			}
		}
		return -1;
	}
	

}
