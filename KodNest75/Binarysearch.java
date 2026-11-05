package KodNest75;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start > end) {
            int mid = start + end / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println("Target value index: " + mid);
            }
        }
        System.out.println("Target value not found");
    }
}
