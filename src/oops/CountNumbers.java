package oops;

public class CountNumbers {
	    public static void main(String[] args) {
	        int[] numbers = {3, -1, 0, 5, -7, 0, 2, -3, 0, 4};
	        
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;

	        for (int number : numbers) {
	            if (number > 0) {
	                positiveCount++;
	            } else if (number < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }

	        System.out.println("Count of Positive Numbers: " + positiveCount);
	        System.out.println("Count of Negative Numbers: " + negativeCount);
	        System.out.println("Count of Zeros: " + zeroCount);
	    }
	}


