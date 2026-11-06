import java.util.Scanner;

public class Missingscan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total product: ");
        int n = sc.nextInt();
        int[] expected = new int[n];
        System.out.print("Enter product ID in assending order: ");
        for (int i = 0; i < n; i++)
            expected[i] = sc.nextInt();
        System.out.print("Enter number of scan : ");
        int m = sc.nextInt();
        int[] scanned = new int[m];
        System.out.print("Enter product ID in random order: ");
        for (int i = 0; i < m; i++)
            scanned[i] = sc.nextInt();
        System.out.println(missingCount(expected, scanned));
        sc.close();
    }

    public static int missingCount(int[] expected, int[] scanned) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < expected.length && j < scanned.length) {
            if (expected[i] == scanned[j]) {
                i++;
                j++;
            } else {
                i++;
                count++;

            }
        }

        // Write your code here
        return count;
    }
}