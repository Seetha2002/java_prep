package linearsearch;

import java.util.Scanner;

public class triplets {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array and the divisible value
        System.out.println("Enter the size of the array (n):");
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];  // Considering array index from 1 to n
        System.out.println("Enter the array elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of d:");
        int d = scanner.nextInt();

        // Count triplets
        long result = countTriplets(arr, d);
        System.out.println("Number of distinct triplets: " + result);

        scanner.close();
    }

    private static long countTriplets(int[] arr,int d) {
        long count = 0;

        for (int i = 1; i <= arr.length - 3; i++) {
            for (int j = i + 1; j <= arr.length - 2; j++) {
                for (int k = j + 1; k <= arr.length-1; k++) {
                    if ((i < j) && (j < k)) {
                        int sum = arr[i] + arr[j] + arr[k];
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
