import java.util.Scanner;

public class Arrange_Zero1st {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total list of seats: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp;
            if (arr[left] != 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            left++;
            right--;
        }
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

}
