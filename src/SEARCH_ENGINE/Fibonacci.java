package SEARCH_ENGINE;

public class Fibonacci {
	
	public int fibonacci(int[] arr, int element_to_search) {
		int fibonacciMinus2 = 0;
		int fibonacciMinus1 = 1;
		int fibonacciNumber = fibonacciMinus2 + fibonacciMinus1;
		int array_length = arr.length;
		while(fibonacciNumber < array_length) {
			fibonacciMinus2 = fibonacciMinus1;
			fibonacciMinus1 = fibonacciNumber;
	        fibonacciNumber = fibonacciMinus2 + fibonacciMinus1;
		}
		int offset = -1;
		while(fibonacciNumber > 1) {
			int i = Math.min(offset+fibonacciMinus2, array_length-1);
			
			if(arr[i] < element_to_search) {
				fibonacciNumber = fibonacciMinus1;
	            fibonacciMinus1 = fibonacciMinus2;
	            fibonacciMinus2 = fibonacciNumber - fibonacciMinus1;
	            offset = i;
			}
			else if (arr[i] > element_to_search) {
	            fibonacciNumber = fibonacciMinus2;
	            fibonacciMinus1 = fibonacciMinus1 - fibonacciMinus2;
	            fibonacciMinus2 = fibonacciNumber - fibonacciMinus1;
	        }
			else {
				return i;
			}
		}
		if (fibonacciMinus1 == 1 && arr[offset+1] == element_to_search) {
			return offset+1;
		}    
	    return -1;
	}

}
