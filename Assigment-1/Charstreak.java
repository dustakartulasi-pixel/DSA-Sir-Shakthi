import java.util.Scanner;

public class Charstreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String word = sc.next();

        int result = longestStreak(word);
        System.out.println("Longest streak: " + result);

        sc.close();
    }

    public static int longestStreak(String word) {
        // Write your code here
        int count = 0;
        int streak = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > streak) {
                streak = count;
            }
        }
        return streak;
    }
}