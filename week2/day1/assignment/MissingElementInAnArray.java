package week2.day1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
				
				Arrays.sort(arr);
				
				for (int i=arr[0];i<=arr.length;i++)
				{
					if (arr[i-1] != i)
					{
						System.out.println("Missing value in the Array list is:"+i);
						break;
					}
					
				}
				

	}

}
