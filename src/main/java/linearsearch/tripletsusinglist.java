package linearsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tripletsusinglist {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array and the divisible value
	        System.out.println("Enter the size of the array (n):");
	        int n = scanner.nextInt();
	        List<Integer> arr = new ArrayList<>();
	        arr.add(null);  // Add a dummy element at index 0 to match the problem statement (index 1 to n)
	        System.out.println("Enter the array elements:");
	        for (int i = 1; i <= n; i++) {
	            arr.add(scanner.nextInt());
	        }

	        System.out.println("Enter the value of d:");
	        int d = scanner.nextInt();

	        // Count triplets
	        int result = countTriplets(arr, d);
	        System.out.println("Number of distinct triplets: " + result);

	        scanner.close();
	    }

	    public static int countTriplets(List<Integer> arr,  int d) {
	        int count = 0;

	        for (int i = 1; i <= arr.size() - 3; i++) {
	            for (int j = i + 1; j <= arr.size() - 2; j++) {
	                for (int k = j + 1; k <= arr.size()-1; k++) {
	                    if ((i < j) && (j < k)) {
	                        int sum = arr.get(i) + arr.get(j) + arr.get(k);
	                        if (sum % d == 0) {
	                            count++;
	                        }
	                    }
	                }
	            }
	        }

	        return count;
	    }
}
