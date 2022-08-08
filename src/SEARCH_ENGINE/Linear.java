package SEARCH_ENGINE;

public class Linear {
	
	public int linear(int[] arr, int element_to_search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element_to_search) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
	
}
