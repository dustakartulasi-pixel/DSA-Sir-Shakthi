import java.util.Scanner;

public class Checkpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter visit array sizeed: ");
        int n = sc.nextInt();
        int[] visited = new int[n];
        System.out.print("Enter array visied elements: ");
        for (int i = 0; i < n; i++) {
            visited[i] = sc.nextInt();
        }
        System.out.print("Enter array size required: ");
        int m = sc.nextInt();
        int[] required = new int[m];
        System.out.print("Enter array required elements: ");
        for (int i = 0; i < m; i++) {
            required[i] = sc.nextInt();
        }

        boolean result = checkRoute(visited, required);

        if (result) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        sc.close();
    }

    public static boolean checkRoute(int[] visited, int[] required) {
        // Write your code here

        int j = 0;

        for (int i = 0; i < visited.length; i++) {

            if (j < required.length && visited[i] == required[j]) {
                j++;
            }
        }

        return j == required.length;
    }
}