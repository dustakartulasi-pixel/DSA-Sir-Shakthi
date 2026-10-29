
import java.util.Scanner;

public class Above_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n = sc.nextInt();
        int totalsum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalsum += arr[i];
        }
        double avg = totalsum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= avg) {
                count++;
            }
        }
        System.out.println("Students above Average: " + count);
    }

}
