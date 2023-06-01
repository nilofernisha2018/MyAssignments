package week.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int n=arr.length+1;
        int x=n*(n+1)/2;
        int y=0;
        for (int i = 0; i < arr.length; i++) {
            y+=arr[i];
        }
        int z=x-y;
        System.out.println("missingNumber is :"+ z);

		
		}
	}





