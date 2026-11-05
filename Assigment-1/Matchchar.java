import java.util.Scanner;

public class Matchchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter orginal string: ");
        String original = sc.next();
        System.out.print("Enter typed String: ");
        String typed = sc.next();
        int result = countMatching(original, typed);
        System.out.println("Matching characters: " + result);

        sc.close();
    }

    public static int countMatching(String original, String typed) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < original.length() - 1; i++) {
            for (int j = i; j < typed.length() - 1; j++) {
                if (original.charAt(i) == typed.charAt(j)) {
                    count++;
                }
            }
        }
        return count - 1;
    }
}