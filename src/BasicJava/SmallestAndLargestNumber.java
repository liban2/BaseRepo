package BasicJava;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {-15,-1827,123,77,8987,77627};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i = 1; i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("\n given array is:"+ Arrays.toString(numbers));
		System.out.println("largest number is ::"+ largest);
		System.out.println("smallest number is ::"+ smallest);
		
	}

}
